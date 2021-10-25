package com.example.jpa

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

/**
 * @author Rasung Ki
 */
@Entity
data class Member(
    @Id
    private val id: Long,

    @Column(name = "name")
    private val username: String,

    private val age: Int,

    @Enumerated(EnumType.STRING)        // 디비에는 enum타입이 없기 때문에 해당 어노테이션을 사용
    private val roleType: RoleType,

    @Temporal(TemporalType.TIMESTAMP)   // Java 8 들어오면서 LocalDate, LocalDateTime을 사용하기 때문에 해당 어노테이션 생략 가능
    private val createDate: Date,

    private val testLocalDate: LocalDate,
    private val testLocalDateTime: LocalDateTime,

    @Temporal(TemporalType.TIMESTAMP)
    private val lastModifiedDate: Date,

    @Lob                                // varchar를 넘어서는 큰 contents를 넣고 싶을때 사용
    private val description: String,
)
