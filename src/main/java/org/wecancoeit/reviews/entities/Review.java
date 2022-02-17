package org.wecancoeit.reviews.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String userName;
    private String comments;
    private int rating;
    private String imgPath;

public Review(){

}

    public Review(String name, String userName, String comments, int rating, String imgPath) {
        this.name = name;
        this.userName = userName;
        this.comments = comments;
        this.rating = rating;
        this.imgPath = imgPath;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getComments() {
        return comments;
    }

    public int getRating() {
        return rating;
    }

    public String getImgPath() {
        return imgPath;
    }
}

