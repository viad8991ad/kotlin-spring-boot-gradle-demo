package org.pegasus.demo.store.model.entity

import jakarta.persistence.Id
import jakarta.persistence.Version
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant
import java.util.UUID

abstract class BaseEntity(
    @Id
    val id: UUID = UUID.randomUUID(),

    @UpdateTimestamp
    val update: Instant = Instant.now(),
    val created: Instant = Instant.now(),
    @Version
    val version: Long = 1,
)
