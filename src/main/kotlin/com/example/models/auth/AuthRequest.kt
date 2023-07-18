package com.example.models.auth

import kotlinx.serialization.Serializable

@Serializable
data class AuthRequest(
    val phone: String
)
