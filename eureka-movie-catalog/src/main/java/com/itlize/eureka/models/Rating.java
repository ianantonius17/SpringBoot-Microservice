package com.itlize.eureka.models;

public class Rating {
    private String movieId;
    private int rating;

    public Rating() {
        this.rating = Integer.MIN_VALUE;
    }
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }


}
