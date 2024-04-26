package org.hw.hardworkpaysoff.item.api

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item(

        @JsonProperty("id")
        val id: Int,

        @JsonProperty("name")
        val name: String,

        @JsonProperty("quantity")
        val quantity: Int,

        @JsonProperty("value")
        val value: Int
)
