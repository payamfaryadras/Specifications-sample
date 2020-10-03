package com.payam.learn.model

import com.payam.learn.enum.PhoneType

class UserDTO() {
    var totalCount: Int? = 0
    var currentPage: Int? = 0
    var pageSize: Int? = 0
    var pageItems: List<Detail>? = null
    class Detail {
        var name: String? = null
        var family: String? = null
        var phone: PhoneType? = null
    }

}