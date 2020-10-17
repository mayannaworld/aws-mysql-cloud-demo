package com.mayanna.awsrdsclouddemo.controller;

import com.mayanna.awsrdsclouddemo.model.Movie;
import com.mayanna.awsrdsclouddemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/movies")
public class MovieResource {

    private MovieService movieService;

    @Autowired
    public MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "/findAllMovies")
    public List<Movie> getAll() {
        return movieService.getAllMovies();
    }

    @PostMapping(value = "/load")
    public List<Movie> persist(@RequestBody final List<Movie> movieList) {
        return movieService.insertMovies(movieList);
    }

}
