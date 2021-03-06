package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity

public class Restaurant {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToOne
    private FoodGenre foodGenre;
    private String description;
    private String url;
    private String img;
    @OneToMany(mappedBy = "restaurant")
    private Collection<Review> reviews;
    @ManyToMany
    private Collection<Hashtag> hashtags;


    public Restaurant(String name, FoodGenre foodGenre, String description, String url,String img,Hashtag...hashtags) {
        this.name = name;
        this.foodGenre = foodGenre;
        this.description = description;
        this.url = url;
        this.img = img;
        this.reviews = new ArrayList<>();
        this.hashtags = Arrays.asList(hashtags);
    }

    public Restaurant() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public FoodGenre getFoodGenre() {
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

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void addHashtag(Hashtag hashtag) {
        hashtags.add(hashtag);

    }
}

