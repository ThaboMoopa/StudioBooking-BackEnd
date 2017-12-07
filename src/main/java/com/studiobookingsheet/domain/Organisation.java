package com.studiobookingsheet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by thabomoopa on 28/11/2017.
 */
@Entity
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String organisationName;
    private String contactDetails;
    private String contactPerson;
    private String webAddress;

    private Organisation(){

    }

    public long getId() {
        return id;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public Organisation(Builder builder) {
        this.id = builder.id;
        this.organisationName = builder.organisationName;
        this.contactDetails = builder.contactDetails;
        this.contactPerson = builder.contactPerson;
        this.webAddress = builder.webAddress;
    }

    public static class Builder{
        private long id;
        private String organisationName;
        private String contactDetails;
        private String contactPerson;
        private String webAddress;

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder organisationName(String value)
        {
            this.organisationName = value;
            return this;
        }
        public Builder contactDetails(String value)
        {
            this.contactDetails = value;
            return this;
        }
        public Builder contactPerson(String value)
        {
            this.contactPerson = value;
            return this;
        }
        public Builder webAddress(String value)
        {
            this.webAddress = value;
            return this;
        }
        public Organisation build(){
            return new Organisation(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Organisation that = (Organisation) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
