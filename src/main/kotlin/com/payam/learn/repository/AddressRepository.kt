package com.payam.learn.repository

import com.payam.learn.entity.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository :JpaRepository<Address,Long> {
}