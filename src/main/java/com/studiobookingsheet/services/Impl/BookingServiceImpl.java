package com.studiobookingsheet.services.Impl;

import com.studiobookingsheet.domain.Booking;
import com.studiobookingsheet.repositories.BookingRepository;
import com.studiobookingsheet.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by thabomoopa on 2017/11/20.
 */
@Component
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking create(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking read(long id) {
        return bookingRepository.findOne(id);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public void delete(long id) {
        bookingRepository.delete(id);
    }

    @Override
    public Iterable<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Iterable<Booking> findByBookingDate(String bookingDate) {
        return bookingRepository.findByBookingDate(bookingDate);
    }

    @Override
    public Booking findByBookingDateAndBookingTime(String bookingDate, String bookingTime) {
        return bookingRepository.findByBookingDateAndBookingTime(bookingDate,bookingTime);
    }

    @Override
    public Iterable<Booking> findByBookingTime(String bookingTime) {
        return bookingRepository.findByBookingTime(bookingTime);
    }
}
