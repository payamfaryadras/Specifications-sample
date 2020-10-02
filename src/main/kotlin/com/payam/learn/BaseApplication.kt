package com.payam.learn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
open class BaseApplication  {
    fun main(args:Array<String>){
        runApplication<BaseApplication>(*args)
    }

}