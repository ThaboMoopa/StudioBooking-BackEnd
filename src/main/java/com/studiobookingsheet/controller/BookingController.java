package com.studiobookingsheet.controller;

import com.studiobookingsheet.domain.Booking;
import com.studiobookingsheet.domain.Colours;
import com.studiobookingsheet.domain.Contributor;
import com.studiobookingsheet.domain.ProgramSlot;
import com.studiobookingsheet.factory.BookingFactory;
import com.studiobookingsheet.services.Impl.BookingServiceImpl;
import com.studiobookingsheet.services.Impl.ColoursServiceImpl;
import com.studiobookingsheet.services.Impl.ContributorServiceImpl;
import com.studiobookingsheet.services.Impl.ProgramSlotServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Controller
@RequestMapping(path = "/booking")
public class BookingController {

    private Booking booking;
    private Contributor contributor;
    private ProgramSlot programSlot;
    private Colours colours;

    @Autowired
    private BookingServiceImpl bookingService;

    @Autowired
    private ColoursServiceImpl coloursService;

    @Autowired
    private ContributorServiceImpl contributorService;

    @Autowired
    private ProgramSlotServiceImpl programSlotService;

    @CrossOrigin
    @GetMapping(path = "/{programId}/{contributorId}/addBooking")
    public @ResponseBody Booking create(@PathVariable long programId, @PathVariable long contributorId, @RequestParam String user,
                                        @RequestParam String bookingDate, @RequestParam String bookingTime,
                                        @RequestParam String technical, @RequestParam String additionalInfo,
                                        @RequestParam String rcsDates)
    {
        Map<String, String> stringValues2 = new HashMap<String,String>();
        stringValues2.put("additionalInfo", additionalInfo);
        stringValues2.put("date", bookingDate);
        stringValues2.put("technical", technical);
        stringValues2.put("time", bookingTime);
        stringValues2.put("rcsDates", rcsDates);
        stringValues2.put("user", user);

        programSlot = programSlotService.read(programId);

        contributor = contributorService.read(contributorId);

        booking = BookingFactory.getBooking(stringValues2, contributor, programSlot);
        return bookingService.create(booking);
    }

    @CrossOrigin
    @GetMapping(path = "/readBooking")
    public @ResponseBody Booking create(@RequestParam long id)
    {

        return bookingService.read(id);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Booking> findAll()
    {
        return bookingService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/findAllByBookingDate")
    public @ResponseBody Iterable<Booking> findAllByDate(@RequestParam String bookingDate)
    {
        return bookingService.findByBookingDate(bookingDate);
    }
    @CrossOrigin
    @GetMapping(path = "/findByBookingDateAndTime")
    public @ResponseBody Booking findAllByDateAndTime(@RequestParam String bookingDate, String bookingTime)
    {
        return bookingService.findByBookingDateAndBookingTime(bookingDate, bookingTime);
    }

    @CrossOrigin
    @GetMapping(path = "/findAllByBookingTime")
    public @ResponseBody Iterable<Booking> findAllByTime(@RequestParam String bookingTime)
    {
        return bookingService.findByBookingTime(bookingTime);
    }
    @CrossOrigin
    @GetMapping(path = "/deleteBooking")
    public @ResponseBody void delete(@RequestParam long id)
    {
        bookingService.delete(id);
    }

}
