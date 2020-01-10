package com.comviva.movie.movieinfoservice.controller;

import com.comviva.movie.movieinfoservice.model.MovieInfo;
import com.comviva.movie.movieinfoservice.service.MovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movieinfo")
public class InfoController {
    @Autowired
    private MovieInfoService movieInfoService;

    @RequestMapping("/{movieId}")
    public MovieInfo getMovieInfoById(@PathVariable("movieId") String moiveId) {
        return movieInfoService.getMovieInfoById(moiveId);
    }

    @RequestMapping("/all")
    public List<MovieInfo> getAllMovie() {
        return movieInfoService.getAllMovie();
    }
}
