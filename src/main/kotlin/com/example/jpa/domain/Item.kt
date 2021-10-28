package com.example.jpa.domain

import javax.persistence.*

/**
 * @author Rasung Ki
 */
@Entity
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private val id: Long,

    private val name: String,

    private val price: Int,

    private val stockQuantity: Int,
)
