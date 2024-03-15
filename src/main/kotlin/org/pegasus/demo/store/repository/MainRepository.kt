package org.pegasus.demo.store.repository

import jakarta.persistence.EntityManager
import org.pegasus.demo.store.model.entity.Item

class MainRepository(
    val entityManager: EntityManager
) {
    fun getItems(): List<Item> {
        return entityManager
            .createQuery("SELECT i from Item", Item::class.java)
            .resultList
    }
}