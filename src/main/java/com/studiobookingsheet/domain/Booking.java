package com.studiobookingsheet.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Entity
public class Booking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookingTime;
    private String bookingDate;
    private String rcsDates;

    private String user;
    private String technical;

    private String additionalInfo;

    @ManyToOne
    private Contributor contributor;

    @ManyToOne
    private ProgramSlot programSlot;

//    @ManyToOne
//    private Colours colours;

    private Booking(){

    }

//    public Colours getColours() {
//        return colours;
//    }

    public String getRcsDates() {
        return rcsDates;
    }

    public ProgramSlot getProgramSlot() {
        return programSlot;
    }

    public long getId() {
        return id;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getUser() {
        return user;
    }

    public String getTechnical() {
        return technical;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public Contributor getContributor() {
        return contributor;
    }

    public Booking(Builder builder) {
        this.id = builder.id;
        this.bookingDate= builder.bookingDate;
        this.bookingTime = builder.bookingTime;
        this.user = builder.user;
        this.contributor = builder.contributor;
        this.technical = builder.technical;
        this.additionalInfo = builder.additionalInfo;
        this.programSlot = builder.programSlot;
       this.rcsDates = builder.rcsDates;
       //this.colours = builder.colours;
    }
    public static class Builder{
        private long id;
        private String bookingTime;
        private String rcsDates;
        private String user;
        private String bookingDate;
        private ProgramSlot programSlot;
        //private Colours colours;

        private Contributor contributor;

        private String technical;

        private String additionalInfo;

//        public Builder colours(Colours value)
//        {
//            this.colours = value;
//            return this;
//        }

        public Builder rcsDates(String value)
        {
            this.rcsDates = value;
                return this;
        }
        public Builder programSlot(ProgramSlot value)
        {
            this.programSlot = value;
            return this;
        }
        public Builder date(String value)
        {
            this.bookingDate = value;
            return this;
        }
        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder time(String time)
        {
            this.bookingTime = time;
            return this;
        }
        public Builder user(String user)
        {
            this.user = user;
            return this;
        }
        public Builder contributor(Contributor value)
        {
            this.contributor = value;
            return this;
        }
        public Builder technical(String value)
        {
            this.technical = value;
            return this;
        }
        public Builder additionalInfo(String value)
        {
            this.additionalInfo = value;
            return this;
        }
        public Booking build()
        {
            return new Booking(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        return id == booking.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}

