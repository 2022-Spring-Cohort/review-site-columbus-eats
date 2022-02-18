package org.wecancoeit.reviews.entities;

import org.wecancoeit.reviews.repo.RestaurantRepo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity

public class Restaurants {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String foodGenre;
    private String description;
    private String url;
    @OneToMany(mappedBy = "restaurants")
    private Collection<Review> reviews;
    @ManyToMany(mappedBy = "restaurants")
    private Collection<Hashtag> hashtag;

    public Restaurants(String name, String foodGenre, String description) {
        this.name = name;
        this.foodGenre = foodGenre;
        this.description = description;
        this.reviews = new ArrayList<>();
        this.hashtag = new ArrayList<>();

    }

    public Restaurants() {

    }

    public long getId() {
        return id;
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

    public String getUrl() {
        return url;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
 reviews.add(review);
}

}

