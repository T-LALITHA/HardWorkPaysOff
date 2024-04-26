package org.hw.hardworkpaysoff.item.dispatcher

import org.hw.hardworkpaysoff.item.api.Item
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ItemGateWay(
        private val restTemplate: RestTemplate,
        @Value("\${items.url}")
        private val itemAppUrl: String
) {
    fun getAllItems(): List<Item> {
        return restTemplate.exchange(
                itemAppUrl,
                HttpMethod.GET,
                null,
                object : ParameterizedTypeReference<List<Item>>() {}).body!!
    }
}