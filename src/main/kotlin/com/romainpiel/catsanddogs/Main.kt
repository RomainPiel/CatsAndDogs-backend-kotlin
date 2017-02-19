package com.romainpiel.catsanddogs

import spark.Spark.get
import spark.Spark.port
import java.lang.System.getenv


fun main(args: Array<String>) {
    getenv("PORT")?.let { port(it.toInt()) }
    get("/") { req, res -> "Cats And Dogs - Kotlin - Server Says Hello" }
}
