package io.javabrains.moviedataservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserRating {
    @Getter @Setter private List<Rating> userRating;
}
