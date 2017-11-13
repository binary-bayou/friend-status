package com.binarybayou.repositories;

import com.binarybayou.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sev on 8/15/17.
 */
@Repository
public interface IUserRepository extends CrudRepository<User, Long> {
    //will use spring data jpa
}
