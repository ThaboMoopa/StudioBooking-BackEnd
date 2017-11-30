package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.User;

/**
 * Created by thabomoopa on 2017/11/16.
 */
public interface UserService {
    User create(User user);
    User read(long id);
    User update(User user);
    void delete(long id);
    Iterable<User> findAll();
    User findByEmailAndPassword(String email, String password);

}
