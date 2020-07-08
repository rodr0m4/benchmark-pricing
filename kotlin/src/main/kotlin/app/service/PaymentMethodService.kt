package app.service

import app.brj.BackgroundReloadable
import app.model.PaymentMethod
import app.store.PaymentMethodStore
import javax.inject.Inject
import javax.inject.Singleton

interface PaymentMethodService {
    suspend fun getAll(ids: Set<String>): Set<PaymentMethod>
}

@Singleton
class PaymentMethodServiceImpl: PaymentMethodService, BackgroundReloadable {
    private var methods: Set<PaymentMethod> = setOf()
    @Inject private lateinit var store: PaymentMethodStore

    override suspend fun load() {
        this.methods = store.all()
    }

    override suspend fun getAll(ids: Set<String>): Set<PaymentMethod> = methods
            .filterTo(HashSet()) { it.id in ids }
}