package com.comviva.movie.movieinfoservice.model;

public class MovieInfo {
    private String movieId;
    private String moivename;
    private String moviedesc;

    public MovieInfo() {
        super();
    }

    public MovieInfo(String movieId, String moivename, String moviedesc) {
        this.movieId = movieId;
        this.moivename = moivename;
        this.moviedesc = moviedesc;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMoivename() {
        return moivename;
    }

    public void setMoivename(String moivename) {
        this.moivename = moivename;
    }

    public String getMoviedesc() {
        return moviedesc;
    }

    public void setMoviedesc(String moviedesc) {
        this.moviedesc = moviedesc;
    }
}
