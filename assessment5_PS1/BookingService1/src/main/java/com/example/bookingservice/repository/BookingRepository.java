package com.example.bookingservice.repository;

import com.example.bookingservice.model.Booking;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookingRepository {

    private Map<Integer, Booking> bookingMap = new HashMap<>();

    public Booking save(Booking booking) {
        bookingMap.put(booking.getBookingId(), booking);
        return booking;
    }

    public List<Booking> findAllBookings() {
        return new ArrayList<>(bookingMap.values());
    }
}