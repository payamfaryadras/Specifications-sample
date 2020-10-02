package com.payam.learn.model

import javax.persistence.*

@Entity
@Table(name = "tbl_phone")
open class Phone {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    protected var id:Long = 0;



}