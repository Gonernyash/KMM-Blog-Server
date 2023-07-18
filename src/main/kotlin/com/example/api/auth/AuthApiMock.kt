package com.example.api.auth

import com.example.models.auth.AuthSuccess
import com.example.models.internal.DataWrapper
import com.example.models.internal.Status
import kotlinx.coroutines.delay

class AuthApiMock : AuthApi {

    override suspend fun sendCode(phone: String): Status {
        delay(DELAY_SEND_CODE)
        return Status.success()
    }

    override suspend fun checkCode(transactionId: String, code: String): DataWrapper<AuthSuccess> {
        delay(DELAY_CHECK_CODE)
        return DataWrapper.success(
            data = AuthSuccess("asdaddas")
        )
    }

    companion object {
        private const val DELAY_SEND_CODE = 1000L
        private const val DELAY_CHECK_CODE = 1000L
    }

}