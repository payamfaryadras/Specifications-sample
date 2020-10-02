package com

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class BaseApplication

    fun main(args:Array<String>){
        runApplication<BaseApplication>(*args)
    }

