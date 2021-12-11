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

    // An Empty Constructor is required by Java to un-marshal something that is not an object to an object

    public Movie(String movieId, String movieName){
        this.movieId = movieId;
        this.movieName = movieName;
    }
}
