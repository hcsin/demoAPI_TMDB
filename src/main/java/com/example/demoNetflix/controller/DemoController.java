package com.example.demoNetflix.controller;

import com.example.demoNetflix.service.TMDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${apiKey}")
    private String apiKey;

    @Autowired
    private TMDBService tmdbService;

    @GetMapping("/")
    public String getData(){
        return apiKey;
    }

    @GetMapping("/movie")
    public String getDiscoverMovie(){
        return tmdbService.discoverMovie(apiKey);
    }

    @GetMapping("/movie/{id}")
    public String getMovieDetails(@PathVariable Long id){
        return tmdbService.getMovie(id, apiKey);
    }
}
