package com.example.models.internal

import kotlinx.serialization.Serializable

@Serializable
data class Error(
    val code: Int,
    val message: String
)
