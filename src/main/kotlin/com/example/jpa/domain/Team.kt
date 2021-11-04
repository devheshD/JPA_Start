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

    @OneToMany(mappedBy = "team")       // 반대편 매핑에 어떤것이 걸려있는지 알려주는 것
    private val members: List<Member>
)
