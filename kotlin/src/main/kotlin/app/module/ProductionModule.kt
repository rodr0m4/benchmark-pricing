package app.module

import app.service.*
import app.store.DiscountStore
import app.store.ItemStore
import app.store.PaymentMethodStore
import app.store.UserStore
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.afterburner.AfterburnerModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import dev.misfitlabs.kotlinguice4.KotlinModule

object ProductionModule : KotlinModule() {
    val objectMapper: ObjectMapper = JsonMapper.builder()
        .addModule(com.fasterxml.jackson.module.kotlin.KotlinModule())
        .addModule(ParameterNamesModule())
        .addModule(Jdk8Module())
        .addModule(JavaTimeModule())
        .addModule(AfterburnerModule())
        .propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
        .build()

    override fun configure() {
        bind<ObjectMapper>().toInstance(objectMapper)

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