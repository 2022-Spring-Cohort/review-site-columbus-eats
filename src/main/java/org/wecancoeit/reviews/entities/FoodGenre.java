package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class FoodGenre {
    @Id
    @GeneratedValue

    private long id;
    private String genre;
    private String desc;
    private String imgUrl;
    @OneToMany(mappedBy = "foodGenre")
    private Collection<Restaurant> restaurants;

    public FoodGenre(String genre, String desc, String imgUrl) {
        this.genre = genre;
        this.desc = desc;
        this.imgUrl = imgUrl;
        this.restaurants = new ArrayList<>();
    }
    public FoodGenre(){

    }

    public long getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getDesc() {
        return desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Collection<Restaurant> getRestaurants() {
        return restaurants;
    }
}
