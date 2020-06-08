package com.itlize.eureka1.models;

import java.util.List;
import java.util.Map;

public class MovieList {
    private Map<String,Movie> movieList;

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
