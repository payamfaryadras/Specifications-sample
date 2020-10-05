package com.payam.learn.specjpa.dynamicquery.repository


import com.payam.learn.specjpa.dynamicquery.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface UserRepository : JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}