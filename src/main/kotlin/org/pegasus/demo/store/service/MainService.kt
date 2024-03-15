package org.pegasus.demo.store.service

import org.pegasus.demo.store.repository.MainRepository

class MainService(val repository: MainRepository) {
    fun getItems() = repository.getItems()
}
