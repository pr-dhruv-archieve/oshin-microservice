package com.comviva.movie.movieratingservice.controller;

import com.comviva.movie.movieratingservice.Service.RatingService;
import com.comviva.movie.movieratingservice.model.RatingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movierating")

public class RatingController {
    @Autowired
    private RatingService ratingService;

    @RequestMapping("/{movieId}")
    public RatingModel getRatingById(@PathVariable("movieId") String movieId) {
        return ratingService.getRatingById(movieId);

    }

    @RequestMapping("/all")
    public List<RatingModel> getAllRatedMovies(){
        return ratingService.getAllRatedMovie();
    }
}
