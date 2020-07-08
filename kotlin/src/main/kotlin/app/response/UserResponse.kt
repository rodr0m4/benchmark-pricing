package app.response

import com.fasterxml.jackson.annotation.JsonProperty

data class UserResponse(
    val id: String,
    @JsonProperty("payment_methods") val paymentMethods: Set<String>
)