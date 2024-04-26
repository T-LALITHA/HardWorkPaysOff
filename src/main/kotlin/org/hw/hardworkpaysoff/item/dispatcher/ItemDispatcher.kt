package org.hw.hardworkpaysoff.item.dispatcher

import org.hw.hardworkpaysoff.item.api.Item
import org.springframework.stereotype.Service

@Service
class ItemDispatcher(
        private val itemGateWay: ItemGateWay
) {
    fun getAllItems(): List<Item> {
        return itemGateWay.getAllItems()
    }
}