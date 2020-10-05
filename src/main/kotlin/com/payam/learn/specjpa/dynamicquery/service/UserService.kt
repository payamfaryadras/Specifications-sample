package com.payam.learn.specjpa.dynamicquery.service

import com.payam.learn.specjpa.dynamicquery.model.UserDTO
import com.payam.learn.specjpa.dynamicquery.model.UserFilter


interface UserService {

    fun search(filter: UserFilter): UserDTO
    fun createData()
}