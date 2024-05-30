package tobe.domain

import kitchenpos.tobe.product.domain.ProductPurgomalumClient
import kitchenpos.tobe.product.domain.entity.ProductV2

object ProductFixtures {
    fun createProduct(): ProductV2 {
        val purgomalumClient =
            object : ProductPurgomalumClient {
                override fun containsProfanity(text: String): Boolean {
                    return false
                }
            }
        return ProductV2.of(
            name = "후라이드치킨",
            price = 16000.toBigDecimal(),
            purgomalumClient = purgomalumClient,
        )
    }
}
