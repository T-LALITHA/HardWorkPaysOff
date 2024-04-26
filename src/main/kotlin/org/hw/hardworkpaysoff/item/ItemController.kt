package org.hw.hardworkpaysoff.item

import org.hw.hardworkpaysoff.item.api.Item
import org.hw.hardworkpaysoff.item.dispatcher.ItemDispatcher
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController(
        private val itemDispatcher: ItemDispatcher
) {

    @GetMapping("/api/items")
    fun getAllItems():ResponseEntity<List<Item>,>{
        val response = itemDispatcher.getAllItems()
        return ResponseEntity(response, HttpStatus.OK)
    }

}