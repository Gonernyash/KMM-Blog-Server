package com.example.models.auth

import kotlinx.serialization.Serializable

@Serializable
data class AuthSuccess(
    val token: String
)
