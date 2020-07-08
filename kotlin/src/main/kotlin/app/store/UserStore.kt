package app.store

import app.response.UserResponse
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.BufferedReader

interface UserStore {
    suspend fun all(): Set<UserResponse>

    companion object : UserStore, FileBasedStore<UserResponse>() {
        override val fileName: String = "mocks/users.json"
        override fun readValues(objectMapper: ObjectMapper, inputStream: BufferedReader): Set<UserResponse> =
                objectMapper.readValue(inputStream)
    }
}