package com.chhaichivon.springbootrxkotlin.services

import com.chhaichivon.springbootrxkotlin.models.Category
import com.chhaichivon.springbootrxkotlin.repositories.CategoryRepository
import org.springframework.stereotype.Service

/**
 * @author by chhai.chivon  on 10/3/2017.
 */
@Service
class CategoryService(val categoryRepository: CategoryRepository) {
    fun findAll(){
        categoryRepository.findAll()
    }
    fun findOne(id: Long){
        categoryRepository.findOne(id)
    }

    fun create(category: Category){
        categoryRepository.save(category)
    }

    fun update(category: Category){
        categoryRepository.save(category)
    }

    fun delete(category: Category){
        categoryRepository.delete(category)
    }
}