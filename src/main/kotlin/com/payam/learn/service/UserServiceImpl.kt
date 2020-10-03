package com.payam.learn.service

import com.payam.learn.model.UserDTO
import com.payam.learn.model.UserFilter
import com.payam.learn.repository.UserRepository
import com.payam.learn.repositoryPage.UserSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class UserServiceImpl @Autowired constructor(private val repository: UserRepository) : UserService {
    override fun search(filter: UserFilter): UserDTO {
        val spec = UserSpec(filter)
        val userDetails = repository.findAll(spec, PageRequest.of(filter.currentPage!!, filter.pageSize!!, Sort.Direction.ASC))

        val details = userDetails.map { item ->
            UserDTO.Detail().apply {
                this.name = item.name!!
                this.family = item.family
            }
        }
        return UserDTO().apply {
            this.pageItems = details.toList()
            this.totalCount = userDetails.size
            this.currentPage = filter.currentPage
            this.pageSize = filter.pageSize
        }

    }

}