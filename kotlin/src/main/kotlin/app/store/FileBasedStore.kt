package app.store

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.BufferedReader

abstract class FileBasedStore<T: Any> {
    private val objectMapper = jacksonObjectMapper()

    abstract val fileName: String
    abstract fun readValues(objectMapper: ObjectMapper, inputStream: BufferedReader): Set<T>

    suspend fun all(): Set<T> =
        this::class.java.classLoader
            .getResourceAsStream(fileName)
            ?.bufferedReader()
            ?.use { reader -> readValues(objectMapper, reader) }
            ?: emptySet()
}