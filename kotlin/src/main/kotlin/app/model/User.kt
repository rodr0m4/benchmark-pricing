package app.model

data class User(val id: String, val paymentMethods: Set<PaymentMethod>)