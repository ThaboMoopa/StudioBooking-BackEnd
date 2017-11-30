package com.studiobookingsheet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thabomoopa on 26/11/2017.
 */
@Entity
public class Colours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String colorName;

    private Colours() {

    }

    public long getId() {
        return id;
    }

    public String getColorName() {
        return colorName;
    }

    public Colours(Builder builder) {
        this.id = builder.id;
        this.colorName = builder.colorName;
    }
    public static class Builder{
        private long id;
        private String colorName;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder colorName(String value)
        {
            this.colorName = value;
            return this;
        }
        public Colours build()
        {
            return new Colours(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Colours colours = (Colours) o;

        return id == colours.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
