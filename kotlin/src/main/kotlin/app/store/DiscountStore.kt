package app.store

import app.model.discount.Discount
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.BufferedReader

interface DiscountStore {
    suspend fun all(): Set<Discount>

    companion object : DiscountStore, FileBasedStore<Discount>() {
        override val fileName: String = "mocks/discounts.json"

        override fun readValues(objectMapper: ObjectMapper, inputStream: BufferedReader): Set<Discount> =
                objectMapper.readValue(inputStream)
    }
}