package com.comviva.movie.moviecatalogservice.Model;

public class movieCatalog {
    private String movieId;
    private String moviename;
    private String moviedesc;
    private String movierating;

    public movieCatalog() {
        super();
    }

    public movieCatalog(String movieId, String moviename, String moviedesc, String movierating) {
        this.movieId = movieId;
        this.moviename = moviename;
        this.moviedesc = moviedesc;
        this.movierating = movierating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedesc() {
        return moviedesc;
    }

    public void setMoviedesc(String moviedesc) {
        this.moviedesc = moviedesc;
    }

    public String getMovierating() {
        return movierating;
    }

    public void setMovierating(String movierating) {
        this.movierating = movierating;
    }
}
