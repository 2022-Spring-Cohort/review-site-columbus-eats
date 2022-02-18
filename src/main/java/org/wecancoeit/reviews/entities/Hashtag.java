package org.wecancoeit.reviews.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String details;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<Restaurant>restaurants;

    public Hashtag(String name, String details) {
        this.name = name;
        this.details = details;
        this.restaurants = new ArrayList<>();
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

    public Collection<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }
}
