package io.javabrains.moviecatalogservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Movie {
    @Getter @Setter private String movieId;
    @Getter @Setter private String movieName;

    public Movie(){
    }

    public Movie(String movieId, String movieName){
        this.movieId = movieId;
        this.movieName = movieName;
    }
}
