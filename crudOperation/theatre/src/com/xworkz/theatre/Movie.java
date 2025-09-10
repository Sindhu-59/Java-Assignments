package com.xworkz.theatre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private String language;
    private int duration;
    private int rating;
}
