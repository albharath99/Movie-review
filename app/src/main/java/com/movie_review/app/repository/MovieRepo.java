package com.movie_review.app.repository;

import com.movie_review.app.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo extends MongoRepository<Movie, Integer> {

}
