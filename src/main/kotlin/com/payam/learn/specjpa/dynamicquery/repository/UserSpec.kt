package com.payam.learn.specjpa.dynamicquery.repository


import com.payam.learn.specjpa.dynamicquery.entity.Address
import com.payam.learn.specjpa.dynamicquery.entity.User
import com.payam.learn.specjpa.dynamicquery.enum.AddressType
import com.payam.learn.specjpa.dynamicquery.model.UserFilter
import org.springframework.data.jpa.domain.Specification
import javax.persistence.criteria.*

class UserSpec(var filter: UserFilter) : Specification<User> {

    override fun toPredicate(root: Root<User>, p1: CriteriaQuery<*>, criteriaBuilder: CriteriaBuilder): Predicate? {
        var predicates: List<Predicate> = emptyList()
        var joinParent: Join<User, Address> = root.join("addresses", JoinType.LEFT)

        if (filter.name != null) predicates.plus(criteriaBuilder.equal(root.get<String>("name"), filter.name));
        if (filter.address != null) predicates.plus(criteriaBuilder.equal(joinParent.get<AddressType>("addressType"), filter.address));
        if (predicates.isEmpty())
            return null
        val res: Array<Predicate> = predicates.toTypedArray()
        return criteriaBuilder.and(*res)
    }
}
