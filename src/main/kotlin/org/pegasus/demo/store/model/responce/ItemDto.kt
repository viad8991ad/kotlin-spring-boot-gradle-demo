package org.pegasus.demo.store.model.responce

import org.pegasus.demo.store.model.Volume
import org.pegasus.demo.store.model.entity.Item
import java.util.UUID

data class ItemDto(
    val id: UUID,
    val name: String,
    val count: Long,
    val volume: Volume,
) {

    companion object {
        fun of(item: Item): ItemDto {
            return ItemDto(
                item.id,
                item.name,
                item.count,
                item.volume,
            )
        }
    }
}