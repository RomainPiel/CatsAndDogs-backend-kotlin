package com.romainpiel.catsanddogs

import spark.Spark.*


object Main {
    @JvmStatic fun main(args: Array<String>) {
        System.getenv("PORT")?.let {
            port(it.toInt())
        }
        get("/") { req, res -> "Hello World!" }
    }
}