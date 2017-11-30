package com.studiobookingsheet.DataLoading;

import com.studiobookingsheet.domain.Booking;
import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.ProgramSlot;
import com.studiobookingsheet.factory.BookingFactory;
import com.studiobookingsheet.factory.ContributorFactory;
import com.studiobookingsheet.services.Impl.BookingServiceImpl;
import com.studiobookingsheet.services.Impl.ColoursServiceImpl;
import com.studiobookingsheet.services.Impl.ContributorServiceImpl;
import com.studiobookingsheet.services.Impl.ProgramSlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Component
public class loadBooking {
    private Booking booking;
    private Contributor contributor;
    private ProgramSlot programSlot;
    private Colours colours;

    private BookingServiceImpl bookingService;

    @Autowired
    private ColoursServiceImpl coloursService;

    @Autowired
    private ContributorServiceImpl contributorService;

    @Autowired
    private ProgramSlotServiceImpl programSlotService;

    @Autowired
    public void loadTechnical(BookingServiceImpl bookingService )
    {
        this.bookingService = bookingService;
        load();
    }

    public void load()
    {
        Map<String, String> stringValues = new HashMap<String,String>();
        stringValues.put("additionalInfo", "Additional information");
        stringValues.put("date", "30_November_17");
        stringValues.put("technical", "Thabo");
        stringValues.put("time", "08h00");
        stringValues.put("user", "Brad");
        stringValues.put("rcsDate", "02,09,16,30");

        Map<String, String> stringValues2 = new HashMap<String,String>();
        stringValues2.put("additionalInfo", "Additional information");
        stringValues2.put("date", "30_November_17");
        stringValues2.put("technical", "Thabo");
        stringValues2.put("time", "08h30");
        stringValues2.put("user", "Brad");
        stringValues2.put("rcsDate", "02,09,16,30");

        Map<String, String> stringValues3 = new HashMap<String,String>();
        stringValues3.put("additionalInfo", "Additional information");
        stringValues3.put("date", "30_November_17");
        stringValues3.put("technical", "Thabo");
        stringValues3.put("time", "09h30");
        stringValues3.put("user", "Brad");
        stringValues3.put("rcsDate", "02,09,16,30");


        contributor = contributorService.read(1);
        programSlot = programSlotService.read(1);


        booking = BookingFactory.getBooking(stringValues, contributor, programSlot);
        bookingService.create(booking);
        booking = BookingFactory.getBooking(stringValues2, contributor,programSlot);
        bookingService.create(booking);
        booking = BookingFactory.getBooking(stringValues3, contributor,programSlot);
        bookingService.create(booking);
    }
}
