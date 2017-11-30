package com.studiobookingsheet.domain;

import com.studiobookingsheet.controller.UserController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/11/16.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;

    private User(){

    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(Builder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.name = builder.name;
    }

    public static class Builder {
        private long id;
        private String email;
        private String password;
        private String name;

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder id(long value){
            this.id = value;
            return this;
        }
        public Builder email(String value)
        {
            this.email = value;
            return this;
        }
        public Builder password(String value)
        {
            this.password = value;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
