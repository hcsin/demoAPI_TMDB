package com.example.demoNetflix.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private int id;
    private String original_title;
    private String overview;
    private String poster_path;
}
