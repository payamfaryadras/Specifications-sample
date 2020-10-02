package com.payam.learn.model

import javax.persistence.*

@Entity
@Table(name = "tbl_user")
open class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    protected var id:Long = 0;

    @Column(name="name" , nullable = true , length = 50)
    protected var name:String?=null

    @Column(name="family" , nullable = true , length = 100)
    protected  var family:String?=null



}