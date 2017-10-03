package com.chhaichivon.springbootrxkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableCaching
@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.chhaichivon.springbootrxkotlin.models"))
@EnableAutoConfiguration
class SpringBootRxKotlinApplication


fun main(args: Array<String>) {
    SpringApplication.run(SpringBootRxKotlinApplication::class.java, *args)
}
