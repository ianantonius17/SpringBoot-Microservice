package com.itlize.eureka2.repository;

import com.itlize.eureka2.models.Rating;

import java.util.HashMap;
import java.util.Map;

public class RatingTable {
    private Map<String, Rating> RatingTable = new HashMap<>();

    public RatingTable(){
        RatingTable.put("tf-100", new Rating("tf-100", 10));
        RatingTable.put("td-5", new Rating("td-5", 9));
        RatingTable.put("mv-3", new Rating("mv-3", 7));
        RatingTable.put("jwl", new Rating("jwl", 1) );
        RatingTable.put("jwt-2", new Rating("jwt-2", 2));
    }

    public Map<String, Rating> getRatingTable() {
        return RatingTable;
    }
}
