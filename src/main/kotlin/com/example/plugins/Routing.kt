package com.example.plugins

import com.example.modules.authModule
import com.example.modules.testModule
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        testModule()
        authModule()
    }
}
