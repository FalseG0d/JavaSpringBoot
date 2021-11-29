package io.javabrains.moviecatalogservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CatalogItem {
    @Setter@Getter
    private String title;

    @Setter@Getter
    private String desc;

    @Setter@Getter
    private int rating;

    public CatalogItem(String title, String desc, int rating){
        this.title = title;
        this.desc = desc;
        this.rating = rating;
    }
}
