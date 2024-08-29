package com.movie_review.app.endpoints;

import com.movie_review.app.model.Movie;
import com.movie_review.app.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "api")
public class MovieController {


    @Autowired
    private MovieRepo movieRepo;

    @PostMapping("/movie")
    public String addUser(@RequestBody Movie movie) {
        movieRepo.save(movie);
        return "OK";
    }

    @GetMapping("/movie")
    public String checkApi() {
        return "WORKING";
    }

}
