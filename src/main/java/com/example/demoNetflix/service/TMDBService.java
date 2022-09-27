package com.example.demoNetflix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="tmdb", url="https://api.themoviedb.org/3")
public interface TMDBService {
    @GetMapping("/discover/movie")
    public String discoverMovie(@RequestParam("api_key") String apiKey);
}
