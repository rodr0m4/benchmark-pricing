package app.model.discount

import app.model.Item
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(
    JsonSubTypes.Type(value = PaymentMethodDiscount::class, name = "PAYMENT_METHOD"),
    JsonSubTypes.Type(value = BrandDiscount::class,         name = "BRAND"),
    JsonSubTypes.Type(value = PriceDiscount::class,         name = "PRICE"),
    JsonSubTypes.Type(value = ItemIDDiscount::class,        name = "ITEM_ID")
)
sealed class Discount(private val amount: Double) {
    protected abstract fun isApplicable(payload: DiscountPayload): Boolean

    operator fun invoke(payload: DiscountPayload): Double? = if (isApplicable(payload)) {
        payload.item.price * amount
    } else {
        null
    }
}

data class PaymentMethodDiscount(val amount: Double, val method: String): Discount(amount) {
    override fun isApplicable(payload: DiscountPayload): Boolean = payload.user.paymentMethods
            .mapTo(HashSet()) { it.id }
            .contains(method)
}

sealed class ItemFieldDiscount(private val amount: Double) : Discount(amount) {
    abstract fun isApplicable(item: Item): Boolean

    override fun isApplicable(payload: DiscountPayload): Boolean = isApplicable(payload.item)
}

data class BrandDiscount(val amount: Double, val brand: String): ItemFieldDiscount(amount) {
    override fun isApplicable(item: Item): Boolean = brand == item.brand
}

data class PriceDiscount(val amount: Double, val bound: Double): ItemFieldDiscount(amount) {
    override fun isApplicable(item: Item): Boolean = item.price >= bound
}

data class ItemIDDiscount(val amount: Double, private val id: String): ItemFieldDiscount(amount) {
    override fun isApplicable(item: Item): Boolean = item.id == id
}