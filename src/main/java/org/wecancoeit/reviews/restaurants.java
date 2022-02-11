package org.wecancoeit.reviews;

import javax.persistence.Entity;

@Entity

public class restaurants {
    private String name;
    private String foodGenre;
    private String description;

    public restaurants(String name, String foodGenre, String description) {
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

