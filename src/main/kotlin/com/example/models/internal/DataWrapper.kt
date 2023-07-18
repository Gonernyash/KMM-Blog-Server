package com.example.models.internal

import kotlinx.serialization.Serializable

@Serializable
data class DataWrapper<T: Any>(
    val success: Boolean,
    val data: T?,
    val message: String?,
    val errorCode: Int? = null,
) {

    companion object {

        fun success(
            message: String = "success"
        ) = DataWrapper(
            success = true,
            data = null,
            message = message
        )

        fun <T: Any> success(
            data: T,
            message: String = "success"
        ) = DataWrapper<T>(
            success = true,
            data = data,
            message = message
        )

        fun error(error: Error) = DataWrapper(
            success = false,
            data = null,
            errorCode = error.code,
            message = error.message
        )

    }

}

