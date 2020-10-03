package com.payam.learn.service

import com.payam.learn.model.UserDTO
import com.payam.learn.model.UserFilter


interface UserService {

    fun search(filter: UserFilter): UserDTO
}