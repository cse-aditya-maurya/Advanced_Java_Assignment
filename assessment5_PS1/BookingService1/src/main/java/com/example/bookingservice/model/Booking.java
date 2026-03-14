package com.example.bookingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    private Integer bookingId;
    private Integer movieId;
    private Integer tickets;
    private Double totalAmount;

}