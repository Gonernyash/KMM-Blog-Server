package com.example.modules

import com.example.models.test.TestModel
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.testModule() {

    get("/test") {
        call.respond(TestModel("test get"))
    }

    post("/test") {
        val a = call.receive<TestModel>()
        call.respond(TestModel("test post"))
    }
}