package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.FoodGenre;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Restaurant;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repo.FoodGenreRepo;
import org.wecancoeit.reviews.repo.HashtagRepo;
import org.wecancoeit.reviews.repo.RestaurantRepo;
import org.wecancoeit.reviews.repo.ReviewRepo;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    ReviewRepo reviewRepo;
    @Autowired
    FoodGenreRepo foodGenreRepo;
    @Autowired
    HashtagRepo hashtagRepo;

    @Override
    public void run(String... args) throws Exception {
        FoodGenre seafood = new FoodGenre("seafood", "Seafood is any form of sea life regarded as food by humans, prominently including fish and shellfish. Shellfish include various species of molluscs, crustaceans, and echinoderms.", "/img/newSeaLogoGenre.jpg");
        foodGenreRepo.save(seafood);
        FoodGenre Africanfood = new FoodGenre("African", "The various cuisines of Africa use a combination of locally available fruits, cereal grains and vegetables, as well as milk and meat products.", "/img/AfricanLogo.png");
        foodGenreRepo.save(Africanfood);

        FoodGenre Asian = new FoodGenre("Asian", "Cuisines can be categorized into several major regional families, including East Asian, Southeast Asian, South Asian, Central Asian, and Middle Eastern cuisines.", "/img/asianGenre.jpg");
        foodGenreRepo.save(Asian);
        FoodGenre Mexican = new FoodGenre("Mexican", "Cuisines consists of the cooking cuisines and traditions of the modern country of Mexico.", "/img/mexGenre.png");
        foodGenreRepo.save(Mexican);

        Hashtag hashtag1 = new Hashtag("Spicy","burns the tongue");
        Hashtag hashtag2 = new Hashtag("Vegetarian","Vegetarian friendly restaurant");
        Hashtag hashtag = new Hashtag("Sweets","dessert available");
        Hashtag hashtag3 = new Hashtag("kidMenu","stuff for the little ones");
        Hashtag hashtag4 = new Hashtag("Bar","get your drink on");
        Hashtag hashtag5 = new Hashtag("Ethnic","good minority eats");
        hashtagRepo.save(hashtag);
        hashtagRepo.save(hashtag1);
        hashtagRepo.save(hashtag2);
        hashtagRepo.save(hashtag3);
        hashtagRepo.save(hashtag4);
        hashtagRepo.save(hashtag5);


        Restaurant restaurants1 = new Restaurant("the Cajun", seafood, "Taste the south with authentic low country boil style cooking", "https://www.cajunboilbar.com/","img/cajunboil.png", hashtag);
        Restaurant restaurants2 = new Restaurant("red lobster", seafood, "mmmmmm biscuits", "https://www.redlobster.com/","img/redLobster.png", hashtag1);
        Restaurant restaurants3 = new Restaurant("Lalibela Ethiopian Restaurant", Africanfood, "Lamb", "https://lalibelarestaurant.net/","img/africanPic2.png/",hashtag4);
        Restaurant restaurants4 = new Restaurant("Hoyo's Kitchen", Africanfood, "goatmeat", "http://hoyoskitchen.com/","img/Somali Restaurant.jpg",hashtag3);
        Restaurant restaurants5 = new Restaurant("Lan Viet", Asian, "Filler Filler Filler", "https://lanvietmarket.com/","img/lanviet.jpg/",hashtag4);
        Restaurant restaurants6 = new Restaurant("Gogi Korean BBQ", Asian, "Filler Filler Filler", "https://gogikbbq.com/","img/Gogi.png/",hashtag,hashtag1,hashtag3);
        Restaurant restaurants7 = new Restaurant("Local Cantina", Mexican, "Filler Filler Filler", "https://localcantina.com/","img/local-cantina-logo.png/",hashtag1);
        Restaurant restaurants8 = new Restaurant("El Vaquero", Mexican, "Filler Filler Filler", "https://www.mexicanrestauranthilliard.com/","img/elVaquero.jpg/",hashtag5);


        restaurantRepo.save(restaurants1);
        restaurantRepo.save(restaurants2);
        restaurantRepo.save(restaurants3);
        restaurantRepo.save(restaurants4);
        restaurantRepo.save(restaurants5);
        restaurantRepo.save(restaurants6);
        restaurantRepo.save(restaurants7);
        restaurantRepo.save(restaurants8);

        Review review1 = new Review("Arjin Harris", "arjinh", "best food ever", 5, "/img/logo.png", restaurants1);
        Review review2 = new Review("Kevin Ha", "crayonEater", "it was good food but not as good as the red crayon", 4, "/img/logo.png", restaurants2);
        reviewRepo.save(review2);
        reviewRepo.save(review1);
        restaurants1.addReview(review1);
        restaurants1.addReview(review2);
        restaurants2.addReview(review1);
        restaurants2.addReview(review2);






    }
}

