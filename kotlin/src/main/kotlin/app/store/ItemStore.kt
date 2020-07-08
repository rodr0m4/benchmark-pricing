package app.store

import app.model.Item
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.BufferedReader

interface ItemStore {
    suspend fun all(): Set<Item>

    companion object : ItemStore, FileBasedStore<Item>() {
        override val fileName: String = "mocks/items.json"
        override fun readValues(objectMapper: ObjectMapper, inputStream: BufferedReader): Set<Item> =
                objectMapper.readValue(inputStream)
    }
}