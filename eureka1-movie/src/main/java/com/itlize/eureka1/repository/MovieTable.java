package com.itlize.eureka1.repository;

import com.itlize.eureka1.models.Movie;

import java.util.HashMap;
import java.util.Map;

public class MovieTable {

    private Map<String, Movie> movieTable = new HashMap<>();
    public MovieTable(){
        movieTable.put("tf-100", new Movie("tf-100", "Transformers","Alien robot movie protecting and destroying earth"));
        movieTable.put("td-5", new Movie("td-5","Terminator Dark moon","Human robot movie"));
        movieTable.put("mv-3", new Movie("mv-3","My Movie Video","Yuqi Zhou journey as Full-stack Java developer"));
        movieTable.put("jwl", new Movie("jwl","Even Jae can do it","Jae is onn the MARKET !!!"));
        movieTable.put("spc-6", new Movie("spc-6","The Journey", "Sang's journey in New Jersey"));
    }

    public Map<String, Movie> getMovieTable() {
        return movieTable;
    }
}
