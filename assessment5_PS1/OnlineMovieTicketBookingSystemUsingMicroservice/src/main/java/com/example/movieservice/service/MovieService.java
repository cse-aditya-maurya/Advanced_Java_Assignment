package com.example.movieservice.service;

import com.example.movieservice.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();

    Movie getMovieById(Integer id);

}