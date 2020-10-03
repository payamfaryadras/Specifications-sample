package com.payam.learn.repositoryPage

import com.payam.learn.entity.Phone
import com.payam.learn.entity.User
import com.payam.learn.enum.PhoneType
import com.payam.learn.model.UserFilter
import org.springframework.data.jpa.domain.Specification
import javax.persistence.criteria.*

class UserSpec(private final var filter: UserFilter) : Specification<User> {

    override fun toPredicate(root: Root<User>, p1: CriteriaQuery<*>, criteriaBuilder: CriteriaBuilder): Predicate? {
        var predicates: List<Predicate> = emptyList()
        var joinParent: Join<User, Phone> = root.join("user_id", JoinType.INNER)

        if (filter.name != null) predicates.plus(criteriaBuilder.equal(joinParent.get<String>("name"), filter.name));
        if (filter.phone != null) predicates.plus(criteriaBuilder.equal(joinParent.get<PhoneType>("phoneType"), filter.phone));
        if (predicates.isEmpty())
            return null
        val res:Array<Predicate> = predicates.toTypedArray()
        return criteriaBuilder.and(*res)
    }
}
