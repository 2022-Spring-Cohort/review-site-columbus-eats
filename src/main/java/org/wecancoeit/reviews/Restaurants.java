package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Restaurants {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String foodGenre;
    private String description;

    public Restaurants(String name, String foodGenre, String description) {
        this.name = name;
        this.foodGenre = foodGenre;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getFoodGenre() {
        return foodGenre;
    }

    public String getDescription() {
        return description;
    }
}

