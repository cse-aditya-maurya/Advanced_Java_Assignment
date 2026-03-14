
package com.example.bookingservice.feign;

import com.example.bookingservice.model.Movie;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "movie-service")
public interface MovieFeignClient {

    @GetMapping("/movies/{id}")
    Movie getMovie(@PathVariable Integer id);

}