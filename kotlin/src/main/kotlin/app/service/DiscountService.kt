package app.service

import app.brj.BackgroundReloadable
import app.exception.UserNotFoundException
import app.model.Item
import app.model.User
import app.model.discount.Discount
import app.model.discount.DiscountPayload
import app.store.DiscountStore
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import javax.inject.Singleton

interface DiscountService {
    suspend fun chooseBestPrice(userId: String, itemIds: Set<String>): Map<String, Double>
}

@Singleton
class DiscountServiceImpl : DiscountService, BackgroundReloadable {
    private var discounts: Set<Discount> = emptySet()

    @Inject private lateinit var userService: UserService
    @Inject private lateinit var itemService: ItemService
    @Inject private lateinit var store: DiscountStore

    override suspend fun load() {
        this.discounts = store.all()
    }

    override suspend fun chooseBestPrice(userId: String, itemIds: Set<String>): Map<String, Double> =
        coroutineScope {
            val user = userService.get(userId) ?: throw UserNotFoundException(userId)
            val items = itemService.getAll(itemIds)

            items
                .map { async { chooseBestPrice(user, it) } }
                .awaitAll()
                .toMap()
        }

    private suspend fun chooseBestPrice(user: User, item: Item): Pair<String, Double> {
        val payload = DiscountPayload(user, item)
        val bestPrice = discounts
                .asSequence()
                .mapNotNull { it(payload) }
                .sorted()
                .firstOrNull() ?: item.price

        return item.id to bestPrice
    }
}