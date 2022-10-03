package com.example.demoNetflix.dto;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private String id;
    private String original_title;
    private String overview;
    private String poster_path;

}
