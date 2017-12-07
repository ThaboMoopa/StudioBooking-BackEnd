package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.User;

/**
 * Created by thabomoopa on 2017/11/16.
 */
public class UserFactory {

    public static User getUser(String email, String password, String name){
        User user = new User.Builder()
                .name(name)
                .email(email)
                .password(password)
                .build();
                return user;
    }
}
