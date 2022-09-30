package com.example.demoNetflix.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private String movieId;
    private String name;
    private String description;

    public Movie(String movieId, String name, String description) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
    }
}
