package org.pegasus.demo.restservice

import org.pegasus.demo.restservice.controller.GreetingController
import org.pegasus.demo.restservice.controller.impl.GreetingControllerImpl
import org.pegasus.demo.restservice.service.GreetingService
import org.pegasus.demo.restservice.service.impl.GreetingServiceImpl
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

val greetingInitializer: ApplicationContextInitializer<GenericApplicationContext> = beans {
    bean<GreetingService> { GreetingServiceImpl() }
    bean<GreetingController> { GreetingControllerImpl(ref()) }
}
