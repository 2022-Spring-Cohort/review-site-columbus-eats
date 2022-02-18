package org.wecancoeit.reviews.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String details;

    @ManyToMany(mappedBy = "hashtags")
    private Restaurants restaurants;

    public Hashtag(String name, String details,Restaurants restaurants) {
        this.name = name;
        this.details = details;
        this.restaurants = restaurants;
    }
    public Hashtag(){

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public Restaurants getRestaurants() {
        return restaurants;
    }
}
