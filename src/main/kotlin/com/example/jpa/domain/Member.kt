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

    @Column(name = "user_name")
    private val userName: String,

//    @Column(name = "team_id")
//    private val teamId: String,

    // JPA에 몇대몇 관계인지 알려줘야한다.
    @ManyToOne
    @JoinColumn(name = "team_id")
    private val team: Team,
)
