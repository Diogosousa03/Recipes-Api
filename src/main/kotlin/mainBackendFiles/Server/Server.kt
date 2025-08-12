package org.example.mainBackendFiles.Server

import org.http4k.core.Method
import org.http4k.routing.bind
import org.http4k.routing.routes
import mainBackendFiles.web_Api.*
import org.http4k.server.asServer
import org.http4k.server.Jetty



const val USE_DATABASE = false

/**
 * Use of HTTP4k to implement HTTP server quickly
 */

fun main(){

val userRoutes = routes(
    "/User" bind Method.POST to User_WebApi::postUser
)

val app = routes(
    userRoutes
)

    val port = System.getenv("PORT")?.toIntOrNull() ?: 8090
    val jettyServer = app.asServer(Jetty(port)).start()
    //loggerInfo("\n\n\u001B[34m Server started on port ${jettyServer.port()} \u001B[36m")
    //loggerInfo("\u001B[32m Server started listening \u001B[36m")
    readln()
    jettyServer.stop()
    //loggerInfo("\n\n\u001B[33m Leaving main")



}