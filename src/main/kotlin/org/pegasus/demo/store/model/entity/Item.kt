package org.pegasus.demo.store.model.entity

import jakarta.persistence.Entity
import org.pegasus.demo.store.model.Volume

@Entity
class Item(
    val name: String,
    val volume: Volume,
    val count: Long,
) : BaseEntity()
