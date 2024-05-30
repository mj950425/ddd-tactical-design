package kitchenpos.tobe.menu.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Transient
import java.math.BigDecimal
import java.util.*

@Table(name = "menu_product")
@Entity
class MenuProductV2 private constructor(
    @Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val seq: Long? = null,
    @Column(name = "price")
    var price: BigDecimal,
    @Column(name = "quantity")
    var quantity: Long,
    @Transient
    val productId: UUID,
) {
    companion object {
        fun of(
            price: BigDecimal,
            quantity: Long,
            productId: UUID,
        ): MenuProductV2 {
            return MenuProductV2(
                price = price,
                quantity = quantity,
                productId = productId,
            )
        }
    }

    fun changePrice(price: BigDecimal) {
        this.price = price
    }
}
