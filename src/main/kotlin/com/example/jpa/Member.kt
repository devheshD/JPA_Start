package com.example.jpa

import javax.persistence.Entity
import javax.persistence.Id

/**
 * @author Rasung Ki
 */
@Entity
data class Member(
    @Id
    private val id: Long,
    private val name: String,
)
