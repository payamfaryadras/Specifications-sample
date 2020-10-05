package com.payam.learn.specjpa.dynamicquery.model

import com.payam.learn.specjpa.dynamicquery.enum.AddressType

class UserFilter {
    var currentPage: Int? = null
    var pageSize: Int? = null
    var name: String? = null
    var address: AddressType? = null
}