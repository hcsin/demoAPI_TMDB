package com.example.demoNetflix.service;

import com.example.demoNetflix.model.Movie;
import com.example.demoNetflix.model.MovieDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@FeignClient(name="tmdb", url="https://api.themoviedb.org/3")
public interface TMDBService {
    @GetMapping("/discover/movie")
    public String discoverMovie(@RequestParam("api_key") String apiKey);
    @GetMapping("/movie/{id}")
    public String getMovie(@PathVariable Long id, @RequestParam("api_key") String apiKey);

        @GetMapping("/movie/{movieId}")
    Movie getMovieById(@PathVariable Long movieId);

//    @GetMapping("/movie/{movieId}")
//    public String getMovieInfo(@PathVariable("movieId") String movieDetail, @RequestParam("api_key") String apiKey) {
//        String movieDetails = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey);
//        return ;
//
//    }
    @RequestMapping(method = RequestMethod.GET, value = "/movie/{movieId}", produces = "application/json")
    Movie getMovie(@PathVariable("movieId") Long movieId);
}
