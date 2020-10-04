package com.payam.learn.entity

import com.payam.learn.enum.AddressType
import javax.persistence.*

@Entity
@Table(name = "tbl_address")
 class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Id
     var id: Long = 0;

    var address:AddressType?=null

    var description:String?=null
}