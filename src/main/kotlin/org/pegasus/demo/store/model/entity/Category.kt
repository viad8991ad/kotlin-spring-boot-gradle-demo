package org.pegasus.demo.store.model.entity

import jakarta.persistence.Entity

@Entity
class Category(
    val name: String,
) : BaseEntity()
