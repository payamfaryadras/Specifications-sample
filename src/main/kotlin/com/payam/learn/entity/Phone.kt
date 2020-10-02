package com.payam.learn.entity


import com.payam.learn.enum.PhoneType
import javax.persistence.*

@Entity
@Table(name = "tbl_phone")
open class Phone {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Id
    protected var id: Long = 0;

    @Column(name = "phone_type", length = 25)
    protected var phoneType: PhoneType? = null

    @Column("number")
    protected var number: String? = null


}