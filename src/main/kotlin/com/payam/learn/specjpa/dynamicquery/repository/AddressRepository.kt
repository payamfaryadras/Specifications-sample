package com.payam.learn.specjpa.dynamicquery.repository


import com.payam.learn.specjpa.dynamicquery.entity.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long> {
}