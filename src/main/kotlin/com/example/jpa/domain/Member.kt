package com.example.jpa.domain

import javax.persistence.*

/**
 * @author Rasung Ki
 */
@Entity
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private val id: Long,

    private val name: String,

    private val city: String,

    private val street: String,

    private val zipcode: String,
)
