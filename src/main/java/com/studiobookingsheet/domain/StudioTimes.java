package com.studiobookingsheet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by thabomoopa on 2017/11/19.
 */
@Entity
public class StudioTimes implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String times;


    private StudioTimes(){

    }

    public long getId() {
        return id;
    }

    public String getTimes() {
        return times;
    }

    public StudioTimes(Builder builder) {
        this.id = builder.id;
        this.times = builder.times;
    }

    public static class Builder
    {
        private long id;
        private String times;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder times(String value)
        {
            this.times = value;
            return this;
        }
        public StudioTimes build()
        {
            return new StudioTimes(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudioTimes that = (StudioTimes) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
