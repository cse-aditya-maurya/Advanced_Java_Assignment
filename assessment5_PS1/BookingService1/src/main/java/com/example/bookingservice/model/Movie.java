package com.example.bookingservice.model;

import lombok.Data;

@Data
public class Movie {

    private Integer id;
    private String name;
    private String language;
    private Double price;

}