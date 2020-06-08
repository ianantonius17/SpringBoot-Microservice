package com.itlize.eureka.models;

public class Movie {

     private String movieId;
     private String name;
     private String desc;
    public Movie() {

    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Movie(String movieId, String name, String desc) {
        this.movieId = movieId;
        this.name = name;
        this.desc = desc;
    }
}