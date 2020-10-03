package com.payam.learn.web.controller

import com.payam.learn.model.UserDTO
import com.payam.learn.model.UserFilter
import com.payam.learn.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class UserSearchController @Autowired constructor(private val service: UserService) {

    fun search(filter: UserFilter): UserDTO {
        return service.search(filter)
    }

}