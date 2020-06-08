package com.itlize.eureka.models;

import java.util.Map;

public class MovieList {
    private Map<String,Movie> movieList;

    public MovieList() {
    }

    public void setMovieList(Map<String,Movie> movieList) {
        this.movieList = movieList;
    }

    public MovieList(Map<String,Movie> movieList) {
        this.movieList = movieList;
    }

    public Map<String,Movie> getMovieList() {
        return movieList;
    }
}
