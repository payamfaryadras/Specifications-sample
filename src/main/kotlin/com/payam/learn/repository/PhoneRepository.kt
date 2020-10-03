package com.payam.learn.repository

import com.payam.learn.entity.Phone
import org.springframework.data.jpa.repository.JpaRepository

interface PhoneRepository :JpaRepository<Phone,Long> {
}