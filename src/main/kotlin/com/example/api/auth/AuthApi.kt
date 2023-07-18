package com.example.api.auth

import com.example.models.auth.AuthSuccess
import com.example.models.internal.DataWrapper
import com.example.models.internal.Status

interface AuthApi {

    suspend fun sendCode(phone: String): Status

    suspend fun checkCode(
        transactionId: String,
        code: String
    ): DataWrapper<AuthSuccess>

}