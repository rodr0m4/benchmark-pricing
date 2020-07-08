package app.controller

import app.dto.GetDTO
import app.service.DiscountService
import io.jooby.Context
import io.jooby.StatusCode
import io.jooby.annotations.GET
import io.jooby.annotations.Path
import io.jooby.annotations.QueryParam
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Path("/price")
class PriceController {
    @Inject private lateinit var discountService: DiscountService

    suspend fun get(context: Context): GetDTO {
        context.run {
            val userIdParam = query(USER_ID_PARAM).valueOrNull()
            val itemIdsParam = query(ITEM_IDS_PARAM).valueOrNull()

            val userId = userIdParam ?: failOnRequired(USER_ID_PARAM)
            val itemIds = itemIdsParam?.split(",")?.mapTo(HashSet()) { it.trim() }

            if (itemIds.isNullOrEmpty()) failOnRequired(ITEM_IDS_PARAM)

            val bestPrices = discountService.chooseBestPrice(userId, itemIds)

            context.responseCode = if (bestPrices.size == itemIds.size) {
                StatusCode.OK
            } else {
                StatusCode.PARTIAL_CONTENT
            }

            return GetDTO(results = bestPrices)
        }
    }

    private fun Context.failOnRequired(name: String): Nothing {
        this.responseCode = StatusCode.BAD_REQUEST
        throw IllegalArgumentException("param $name is required")
    }

    companion object {
        const val USER_ID_PARAM = "user_id"
        const val ITEM_IDS_PARAM = "item_ids"
    }
}