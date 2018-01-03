package com.studiobookingsheet.factory;

import com.studiobookingsheet.domain.Booking;
import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.ProgramSlot;

import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public class BookingFactory {
    public static Booking getBooking(Map<String, String> stringValues, Contributor contributor, ProgramSlot programSlot)
    {
        Booking booking = new Booking.Builder()
                .user(stringValues.get("user"))
                .date(stringValues.get("date"))
                .contributor(contributor)
                .programSlot(programSlot)
                .time(stringValues.get("time"))
                .rcsDates(stringValues.get("rcsDates"))
                .technical(stringValues.get("technical"))
                .additionalInfo(stringValues.get("additionalInfo"))
                //.colours(colours)
                .build();
        return booking;
    }
}
