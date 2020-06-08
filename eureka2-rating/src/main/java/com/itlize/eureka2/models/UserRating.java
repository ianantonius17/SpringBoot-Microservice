package com.itlize.eureka2.models;

import java.util.List;
import java.util.Map;

public class UserRating {
    private Map<String,Rating> userRating;

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
