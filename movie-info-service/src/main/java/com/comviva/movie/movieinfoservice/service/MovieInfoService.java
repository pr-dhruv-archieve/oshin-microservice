package com.comviva.movie.movieinfoservice.service;

import com.comviva.movie.movieinfoservice.model.MovieInfo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieInfoService {
    private List<MovieInfo> movieInfos = Arrays.asList(
            new MovieInfo("1", "Mission Impossible", "Tom cruize starer"),
            new MovieInfo("2", "3 idiots", "Engineers Life")


    );

    public List<MovieInfo> getAllMovie() {
        return movieInfos;
    }

    public MovieInfo getMovieInfoById(String movieId) {
        for (MovieInfo movieInfo : movieInfos) {
            if (movieInfo.getMovieId().equals(movieId)) {
                return movieInfo;
            }

        }
        return null;
    }
}
