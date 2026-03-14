package com.example.movieservice.repository;

import com.example.movieservice.model.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {

    private Map<Integer, Movie> movieMap = new HashMap<>();

    @PostConstruct
    public void loadMovies() {

        movieMap.put(1, new Movie(1, "Inception", "English", 250.0));
        movieMap.put(2, new Movie(2, "Interstellar", "English", 300.0));
        movieMap.put(3, new Movie(3, "RRR", "Telugu", 200.0));

    }

    public List<Movie> findAllMovies() {
        return new ArrayList<>(movieMap.values());
    }

    public Optional<Movie> findMovieById(Integer id) {
        return Optional.ofNullable(movieMap.get(id));
    }

}