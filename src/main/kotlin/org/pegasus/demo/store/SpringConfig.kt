package org.pegasus.demo.store

import org.pegasus.demo.store.controller.MainController
import org.pegasus.demo.store.repository.MainRepository
import org.pegasus.demo.store.service.MainService
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

val storeInitializer: ApplicationContextInitializer<GenericApplicationContext> = beans {
    bean { MainRepository(ref()) }
    bean { MainService(ref()) }
    bean { MainController(ref()) }
}
