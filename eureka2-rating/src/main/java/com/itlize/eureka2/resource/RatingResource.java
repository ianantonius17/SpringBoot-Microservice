package com.itlize.eureka2.resource;

import com.itlize.eureka2.Eureka2Application;
import com.itlize.eureka2.models.Rating;
import com.itlize.eureka2.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {

    Map<String,Rating> RatingTable = Eureka2Application.ratingTable.getRatingTable();
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

        //Map<String,Rating> RatingTable = Eureka2Application.ratingTable.getRatingTable();
        Rating rating = RatingTable.get(movieId);

        if(rating == null) return new Rating();
        return rating;
        //return new Rating(movieId, 4);
    }
    @RequestMapping("/allRatings")
    public Map<String,Rating> getAllRatings(@PathVariable("userId") String userId){
        return RatingTable;
    }
    @RequestMapping("users/{userId}")
    public UserRating  getRatingByUserId(@PathVariable("userId") String userId){

        /* List<Rating> ratings = Arrays.asList(
                 new Rating("tf-100", 4),
                 new Rating ("td-5", 5)
         );*/

        //Map<String,Rating> RatingTable = Eureka2Application.ratingTable.getRatingTable();
        //List<Rating> ratings = new ArrayList<>(RatingTable.values());

        UserRating userRating = new UserRating(RatingTable);

        return userRating;
     }


}
