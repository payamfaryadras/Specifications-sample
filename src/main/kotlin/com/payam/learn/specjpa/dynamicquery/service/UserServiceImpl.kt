package com.payam.learn.specjpa.dynamicquery.service

import com.payam.learn.specjpa.dynamicquery.entity.Address
import com.payam.learn.specjpa.dynamicquery.entity.User
import com.payam.learn.specjpa.dynamicquery.enum.AddressType
import com.payam.learn.specjpa.dynamicquery.model.UserDTO
import com.payam.learn.specjpa.dynamicquery.model.UserFilter
import com.payam.learn.specjpa.dynamicquery.repository.AddressRepository
import com.payam.learn.specjpa.dynamicquery.repository.UserRepository
import com.payam.learn.specjpa.dynamicquery.repository.UserSpec
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository, private val addressRepository: AddressRepository) : UserService {
    override fun search(filter: UserFilter): UserDTO {
        val spec = UserSpec(filter)
        val userDetails = userRepository.findAll(spec, PageRequest.of(filter.currentPage!!, filter.pageSize!!, Sort.Direction.ASC,"name"))

        val details = userDetails.map { item ->
            UserDTO.Detail().apply {
                this.name = item.name!!
                this.family = item.family
                this.addresses = item.addresses
            }
        }
        return UserDTO().apply {
            this.pageItems = details.toList()
            this.totalCount = userDetails.size
            this.currentPage = filter.currentPage
            this.pageSize = filter.pageSize
        }

    }

    override fun createData() {
        var user1 = userRepository.save(User().apply {
            this.name="test"
            this.family="test2"
        })
        var address1 = addressRepository.save(Address().apply {
            this.description = "desc1"
            this.addressType = AddressType.Home
        })
        user1.addresses = mutableSetOf(address1)
        userRepository.save(user1)
    }

}