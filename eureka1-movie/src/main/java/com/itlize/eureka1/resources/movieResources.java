package com.itlize.eureka1.resources;

import com.itlize.eureka1.Eureka1Application;
import com.itlize.eureka1.models.Movie;
import com.itlize.eureka1.models.MovieList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movie")
public class movieResources {


    Map<String,Movie> movieTable= Eureka1Application.movieTable.getMovieTable();

    @RequestMapping("{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId){

        Movie movie = movieTable.get(movieId);

        if(movie == null) return new Movie();

        //return new Movie(movieId, Eureka1Application.movieList.get(movieId));
        return movieTable.get(movieId);
    }

    @RequestMapping("/allMovie")
    public Map<String, Movie> getAllMovies(){
        return movieTable;
    }

    @RequestMapping("/users/{userId}")
    public MovieList getMovieByUser(@PathVariable("userId") String userId) {
        MovieList movieList = new MovieList(movieTable);
        return movieList;
    }

}
