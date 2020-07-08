package app.store

import app.model.PaymentMethod
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.BufferedReader

interface PaymentMethodStore {
    suspend fun all(): Set<PaymentMethod>

    companion object : PaymentMethodStore, FileBasedStore<PaymentMethod>() {
        override val fileName: String = "mocks/payment_methods.json"
        override fun readValues(objectMapper: ObjectMapper, inputStream: BufferedReader): Set<PaymentMethod> =
                objectMapper.readValue(inputStream)
    }
}