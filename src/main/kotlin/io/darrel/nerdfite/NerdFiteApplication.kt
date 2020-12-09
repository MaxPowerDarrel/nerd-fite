package io.darrel.nerdfite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NerdFiteApplication

fun main(args: Array<String>) {
    runApplication<NerdFiteApplication>(*args)
}
