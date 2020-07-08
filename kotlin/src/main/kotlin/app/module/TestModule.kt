package app.module

import app.service.*
import app.store.DiscountStore
import app.store.ItemStore
import app.store.PaymentMethodStore
import app.store.UserStore
import dev.misfitlabs.kotlinguice4.KotlinModule

object TestModule : KotlinModule() {
    override fun configure() {
        // Services
        bind<DiscountService>().to<DiscountServiceImpl>()
        bind<ItemService>().to<ItemServiceImpl>()
        bind<PaymentMethodService>().to<PaymentMethodServiceImpl>()
        bind<UserService>().to<UserServiceImpl>()

        // Stores
        bind<DiscountStore>().toInstance(DiscountStore)
        bind<ItemStore>().toInstance(ItemStore)
        bind<PaymentMethodStore>().toInstance(PaymentMethodStore)
        bind<UserStore>().toInstance(UserStore)
    }
}