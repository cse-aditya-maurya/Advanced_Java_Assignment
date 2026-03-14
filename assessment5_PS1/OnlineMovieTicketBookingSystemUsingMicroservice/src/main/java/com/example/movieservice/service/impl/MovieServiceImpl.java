package com.example.movieservice.service.impl;

import com.example.movieservice.exception.MovieNotFoundException;
import com.example.movieservice.model.Movie;
import com.example.movieservice.repository.MovieRepository;
import com.example.movieservice.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAllMovies();
    }

    @Override
    public Movie getMovieById(Integer id) {

        return movieRepository.findMovieById(id)
                .orElseThrow(() ->
                        new MovieNotFoundException("Movie not found with id : " + id));
    }
}