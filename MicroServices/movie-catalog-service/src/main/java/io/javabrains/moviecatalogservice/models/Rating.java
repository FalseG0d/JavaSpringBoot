package io.javabrains.moviecatalogservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Rating {
    @Getter @Setter private String movieId;
    @Getter @Setter private int rating;

    public Rating(String movieId, int rating){
        this.movieId = movieId;
        this.rating = rating;
    }
}
