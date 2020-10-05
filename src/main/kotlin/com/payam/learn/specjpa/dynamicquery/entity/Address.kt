package com.payam.learn.specjpa.dynamicquery.entity

import com.payam.learn.specjpa.dynamicquery.enum.AddressType
import javax.persistence.*

@Entity
@Table(name = "tbl_address")
class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Id
    var id: Long = 0;

    var addressType: AddressType? = null

    var description: String? = null
}