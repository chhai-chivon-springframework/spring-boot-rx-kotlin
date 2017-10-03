package com.chhaichivon.springbootrxkotlin.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

/**
 * @author by chhai.chivon  on 10/3/2017.
 */
@Entity
data class Category(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var name: String = "",
        var description: String = ""
)