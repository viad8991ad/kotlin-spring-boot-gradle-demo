package org.pegasus.demo.restservice.controller.impl

import org.pegasus.demo.restservice.controller.GreetingController
import org.pegasus.demo.restservice.service.GreetingService
import org.springframework.web.bind.annotation.RequestParam

class GreetingControllerImpl(
    private val greetingService: GreetingService,
) : GreetingController {

    override fun greeting(@RequestParam name: String): String {
        return greetingService.createResponse(name)
    }
}
