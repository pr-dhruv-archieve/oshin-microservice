package com.comviva.movie.movieratingservice.model;

public class RatingModel {
    private String movieId;
    private String movierating;

    public RatingModel() {
        super();
    }

    public RatingModel(String movieId, String movierating) {
        this.movieId = movieId;
        this.movierating = movierating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovierating() {
        return movierating;
    }

    public void setMovierating(String movierating) {
        this.movierating = movierating;
    }
}
