package com.studiobookingsheet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Entity
public class Technical implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    private Technical(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Technical(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }
    public static class Builder{
        private long id;
        private String name;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Technical build()
        {
            return new Technical(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Technical technical = (Technical) o;

        return id == technical.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
