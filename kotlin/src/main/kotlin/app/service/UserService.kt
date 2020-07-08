package app.service

import app.brj.BackgroundReloadable
import app.model.User
import app.response.UserResponse
import app.store.UserStore
import javax.inject.Inject
import javax.inject.Singleton

interface UserService {
    suspend fun get(id: String): User?
}

@Singleton
class UserServiceImpl: UserService, BackgroundReloadable {
    private var users: Set<User> = emptySet()

    @Inject private lateinit var store: UserStore
    @Inject private lateinit var paymentMethodService: PaymentMethodService

    override suspend fun load() {
        this.users = store.all().mapTo(HashSet()) { parse(it) }
    }

    override suspend fun get(id: String): User? = users.find { it.id == id }

    private suspend fun parse(response: UserResponse): User {
        val paymentMethods = paymentMethodService.getAll(response.paymentMethods)
        return User(id = response.id, paymentMethods = paymentMethods)
    }
}