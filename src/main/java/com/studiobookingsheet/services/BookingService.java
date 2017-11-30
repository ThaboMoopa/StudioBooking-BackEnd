package com.studiobookingsheet.services;

import com.studiobookingsheet.domain.Booking;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public interface BookingService  {
    Booking create(Booking booking);
    Booking read(long id);
    Booking update(Booking booking);
    void delete(long id);
    Iterable<Booking> findAll();
    Iterable<Booking> findByBookingDate(String bookingDate);
    Iterable<Booking> findByBookingTime(String bookingTime);
    Booking findByBookingDateAndBookingTime(String bookingDate, String bookingTime);
}
