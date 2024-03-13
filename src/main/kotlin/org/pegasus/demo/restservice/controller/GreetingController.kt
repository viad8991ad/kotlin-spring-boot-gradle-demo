package org.pegasus.demo.restservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("/api/v1")
interface GreetingController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam name: String): String
}
