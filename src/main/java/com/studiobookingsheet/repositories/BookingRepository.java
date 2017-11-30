package com.studiobookingsheet.repositories;

import com.studiobookingsheet.domain.Booking;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thabomoopa on 2017/11/20.
 */
public interface BookingRepository extends CrudRepository<Booking, Long> {
    Iterable<Booking> findByBookingDate(String bookingDate);
    Iterable<Booking> findByBookingTime(String bookingTime);
    Iterable<Booking> findByBookingTimeAndBookingDate(String bookingTime, String bookingDate);
    Booking findByBookingDateAndBookingTime(String bookingDate, String bookingTime);

}
