package com.movie_review.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MovieReviewSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewSystemApplication.class, args);

		System.out.println("Bro");
	}

}
