package com.payam.learn.specjpa.dynamicquery.controller


import com.payam.learn.specjpa.dynamicquery.model.UserDTO
import com.payam.learn.specjpa.dynamicquery.model.UserFilter
import com.payam.learn.specjpa.dynamicquery.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller(value = "/search")
class UserSearchController @Autowired constructor(private val service: UserService) {

    @RequestMapping(method = [RequestMethod.GET])
    fun search(filter: UserFilter): UserDTO {
        return service.search(filter)
    }


    @RequestMapping(method = [RequestMethod.POST],value = ["/init"])
    fun create(): ResponseEntity<String> {
         service.createData()
        return ResponseEntity(HttpStatus.OK)
    }

}