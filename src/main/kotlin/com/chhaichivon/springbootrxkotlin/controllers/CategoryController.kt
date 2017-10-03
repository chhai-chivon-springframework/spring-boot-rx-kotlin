package com.chhaichivon.springbootrxkotlin.controllers

import com.chhaichivon.springbootrxkotlin.models.Category
import com.chhaichivon.springbootrxkotlin.services.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @author by chhai.chivon  on 10/3/2017.
 */
@RestController
@RequestMapping(value = "/api/categories")
class CategoryController(val categoryService: CategoryService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun findAll(){
        categoryService.findAll()
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    fun findOne(id:Long){
        categoryService.findOne(id)
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun create(@Valid @RequestBody category: Category) {
        categoryService.create(category)
    }

}