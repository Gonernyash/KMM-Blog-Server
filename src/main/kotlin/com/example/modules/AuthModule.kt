package com.example.modules

import com.example.models.auth.AuthRequest
import com.example.models.internal.Error
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.authModule() {
    install(ContentNegotiation) {
        json()
    }

    post("/auth/phone") {

        val req = call.receive<AuthRequest>()
        req.phone?.let { phone ->

        } ?: call.respond(status = HttpStatusCode.OK, Error(100, "no phone"))
    }

}