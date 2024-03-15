package org.pegasus.demo.store.controller

import org.pegasus.demo.store.model.entity.Item
import org.pegasus.demo.store.service.MainService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.io.Serial

@RestController("/api/v1/item")
class MainController(
    val service: MainService,
) {

    @GetMapping("list")
    fun greeting(): List<Item> {
        val items = service.getItems()
        if (items.isEmpty()) throw ItemsNotFound()
        return items
    }
}

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such Items")
class ItemsNotFound : RuntimeException() {
    companion object {
        @Serial
        private const val serialVersionUID: Long = -4_032_751_902_641_226_509L
    }
}
