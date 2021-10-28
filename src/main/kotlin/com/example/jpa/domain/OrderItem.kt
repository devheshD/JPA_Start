package com.example.jpa.domain

import javax.persistence.*

/**
 * @author Rasung Ki
 */
@Entity
data class OrderItem (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private val id: Long,

    @Column(name = "order_id")
    private val orderId: Long,

    @Column(name = "item_id")
    private val itemId: Long,

    private val orderPrice: Int,

    private val count: Int,
)
