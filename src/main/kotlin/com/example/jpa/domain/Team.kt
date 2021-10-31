package com.example.jpa.domain

import javax.persistence.*

/**
 * @author Rasung Ki
 */

@Entity
data class Team(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private val id: Long,

    private val name: String,
)
