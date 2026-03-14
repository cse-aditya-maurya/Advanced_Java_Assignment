package com.example.bookingservice.service.impl;

import com.example.bookingservice.feign.MovieFeignClient;
import com.example.bookingservice.model.Booking;
import com.example.bookingservice.model.Movie;
import com.example.bookingservice.repository.BookingRepository;
import com.example.bookingservice.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final MovieFeignClient movieFeignClient;

    public BookingServiceImpl(BookingRepository bookingRepository,
                              MovieFeignClient movieFeignClient) {
        this.bookingRepository = bookingRepository;
        this.movieFeignClient = movieFeignClient;
    }

    @Override
    public Booking bookTicket(Booking booking) {

        // ⭐ Call Movie Service
        Movie movie = movieFeignClient.getMovie(booking.getMovieId());

        // ⭐ Calculate amount
        Double amount = movie.getPrice() * booking.getTickets();
        booking.setTotalAmount(amount);

        // ⭐ Generate booking id
        booking.setBookingId(new Random().nextInt(1000));

        // ⭐ Save booking
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAllBookings();
    }
}