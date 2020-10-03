package com.payam.learn.repository

import com.payam.learn.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface UserRepository :JpaRepository<User,Long>  , JpaSpecificationExecutor<User> {
}