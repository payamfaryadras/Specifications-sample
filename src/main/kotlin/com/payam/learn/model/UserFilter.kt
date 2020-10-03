package com.payam.learn.model

import com.payam.learn.enum.PhoneType

class UserFilter {
    var currentPage: Int? = null
    var pageSize: Int? = null
    var uniqueId: String? = null
    var name: Boolean? = null
    var phone: PhoneType? = null
}