package com.studiobookingsheet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Entity
public class ProgramSlot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String time;

    private ProgramSlot(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public ProgramSlot(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.time = builder.time;
    }

    public static class Builder{
        private long id;
        private String name;
        private String time;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder name(String value)
        {
            this.name = value;
            return this;
        }
        public Builder time(String value)
        {
            this.time = value;
            return this;
        }

        public ProgramSlot build()
        {
            return new ProgramSlot(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgramSlot that = (ProgramSlot) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
