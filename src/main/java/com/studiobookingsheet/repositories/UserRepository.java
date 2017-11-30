package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thabomoopa on 2017/11/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmailIgnoreCaseAndPassword(String email, String password);

}
