package com.example.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineMovieTicketBookingSystemUsingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieTicketBookingSystemUsingMicroserviceApplication.class, args);
	}

}
