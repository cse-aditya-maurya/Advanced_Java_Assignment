package com.example.bookingservice.service;

import com.example.bookingservice.model.Booking;

import java.util.List;

public interface BookingService {

    Booking bookTicket(Booking booking);

    List<Booking> getAllBookings();
}