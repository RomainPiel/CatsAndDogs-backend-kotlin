package com.romainpiel.catsanddogs

import spark.Spark.*
import java.lang.System.getenv


fun main(args: Array<String>) {
    getenv("PORT")?.let { port(it.toInt()) }
    staticFileLocation("/public")
    get("/") { req, res ->  "Cats And Dogs - Kotlin - Server Says Hello" }
}
