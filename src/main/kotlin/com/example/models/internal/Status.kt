package com.example.models.internal

import kotlinx.serialization.Serializable

@Serializable
data class Status(
    val success: Boolean,
    val errorCode: Int?,
    val message: String
) {

    companion object {

        fun success(message: String = "success") = Status(
            success = true,
            errorCode = null,
            message = message
        )

        fun error(error: Error) = Status(
            success = false,
            errorCode = error.code,
            message = error.message
        )

    }

}