package com.itlize.eureka.resources;

import com.itlize.eureka.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    //@Autowired
    //private WebClient.Builder webClientBuilder;

    @RequestMapping("/movie/{movieId}")
    public CatalogItem getMovie(@PathVariable("movieId") String movieId){
        Rating rating = restTemplate.getForObject("http://eureka2-client-rating/ratingdata/"+ movieId, Rating.class);
        Movie movie = restTemplate.getForObject("http://eureka1-client-movie/movie/"+ movieId, Movie.class);

        return new CatalogItem(movie.getMovieId(),movie.getName(),movie.getDesc(),rating.getRating());
    }

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        //RestTemplate restTemplate = new RestTemplate();

        //UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingdata/users/" + userId, UserRating.class);
        UserRating ratings = restTemplate.getForObject("http://eureka2-client-rating/ratingdata/users/" + userId, UserRating.class);
        MovieList movies = restTemplate.getForObject("http://eureka1-client-movie/movie/users/" + userId, MovieList.class);

        Set<String> keys = new HashSet<>(ratings.getUserRating().keySet());
        keys.addAll(movies.getMovieList().keySet());

        List<String> keyList = new ArrayList<>();
        keyList.addAll(keys);

        return keyList.stream().map(id ->{
            Rating rating = restTemplate.getForObject("http://eureka2-client-rating/ratingdata/"+ id, Rating.class);
            Movie movie = restTemplate.getForObject("http://eureka1-client-movie/movie/"+id, Movie.class);


            return new CatalogItem(id,movie.getName(),movie.getDesc(),rating.getRating());
        }).collect(Collectors.toList());
        /*return ratings.getUserRating().stream().map(rating -> {
            *//*
            Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8082/movie/"+ rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
            *//*

            //for each movieId ,call movie info service and get details
            // Movie movie = restTemplate.getForObject("http://8082/movie/"+ rating.getMovieId(), Movie.class);
            Movie movie = restTemplate.getForObject("http://eureka1-client-movie/movie/"+ rating.getMovieId(), Movie.class);


            //put them all together
            return new CatalogItem(rating.getMovieId(),movie.getName(), movie.getDesc(), rating.getRating());

        })
         .collect(Collectors.toList());*/

    }

}
