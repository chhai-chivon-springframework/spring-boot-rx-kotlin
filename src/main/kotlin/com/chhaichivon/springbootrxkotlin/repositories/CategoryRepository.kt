package com.chhaichivon.springbootrxkotlin.repositories

import com.chhaichivon.springbootrxkotlin.models.Category
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

/**
 * @author by chhai.chivon  on 10/3/2017.
 */
@Repository
interface CategoryRepository : PagingAndSortingRepository<Category,Long> {
}