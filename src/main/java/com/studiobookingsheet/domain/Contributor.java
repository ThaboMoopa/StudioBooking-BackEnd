package com.studiobookingsheet.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/11/17.
 */
@Entity
public class Contributor  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private String email;
    private String contact;
    private String position;
    private String additionalContact;

    @ManyToOne
    private Organisation organisation;

    private Contributor(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public String getPosition() {
        return position;
    }

    public String getAdditionalContact() {
        return additionalContact;
    }

    public Contributor(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.contact = builder.contact;
        this.organisation = builder.organisation;
        this.position = builder.position;
        this.additionalContact = builder.additionalContact;
    }
    public static class Builder{
        private long id;
        private String name;
        private String surname;
        private String email;
        private String contact;
        private Organisation organisation;
        private String position;
        private String additionalContact;

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
        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder contact(String value)
        {
            this.contact = value;
            return this;
        }
        public Builder organisation(Organisation value)
        {
            this.organisation = value;
            return this;
        }
        public Builder position(String value)
        {
            this.position = value;
            return this;
        }
        public Builder additionalContact(String value)
        {
            this.additionalContact = value;
            return this;
        }
        public Contributor build(){
            return new Contributor(this);
        }
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", position='" + position + '\'' +
                ", additionalContact='" + additionalContact + '\'' +
                ", organisation=" + organisation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contributor that = (Contributor) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
