package com.itlize.eureka.models;

import java.util.Map;

public class UserRating {
    private Map<String,Rating> userRating;

    public UserRating() {
    }

    public UserRating(Map<String, Rating> userRating) {
        this.userRating = userRating;
    }

    public Map<String,Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(Map<String,Rating> userRating) {
        this.userRating = userRating;
    }
}
