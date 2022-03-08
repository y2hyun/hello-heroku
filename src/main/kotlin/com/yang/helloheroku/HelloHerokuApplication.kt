package com.yang.helloheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloHerokuApplication

fun main(args: Array<String>) {
    runApplication<HelloHerokuApplication>(*args)
}
