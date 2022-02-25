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
        FoodGenre seafood = new FoodGenre("Seafood", "Seafood is any form of sea life regarded as food by humans, prominently including fish and shellfish. Shellfish include various species of molluscs, crustaceans, and echinoderms.", "/img/newSeaLogoGenre.jpg");
        foodGenreRepo.save(seafood);
        FoodGenre Africanfood = new FoodGenre("African", "The various cuisines of Africa use a combination of locally available fruits, cereal grains and vegetables, as well as milk and meat products.", "/img/AfricanLogo.png");
        foodGenreRepo.save(Africanfood);

        FoodGenre Asian = new FoodGenre("Asian", "Cuisines can be categorized into several major regional families, including East Asian, Southeast Asian, South Asian, Central Asian, and Middle Eastern cuisines.", "/img/asianGenre.jpg");
        foodGenreRepo.save(Asian);
        FoodGenre Mexican = new FoodGenre("Mexican", "Cuisines consists of the cooking cuisines and traditions of the modern country of Mexico.", "/img/mexGenre.png");
        foodGenreRepo.save(Mexican);

        Hashtag hashtag1 = new Hashtag("Spicy","Burns the tongue");
        Hashtag hashtag2 = new Hashtag("Vegetarian","Vegetarian friendly restaurant");
        Hashtag hashtag = new Hashtag("Sweets","Dessert available");
        Hashtag hashtag3 = new Hashtag("KidsMenu","Stuff for the little ones");
        Hashtag hashtag4 = new Hashtag("Bar","Get your drink on");
        Hashtag hashtag5 = new Hashtag("Ethnic","Good minority eats");
        hashtagRepo.save(hashtag);
        hashtagRepo.save(hashtag1);
        hashtagRepo.save(hashtag2);
        hashtagRepo.save(hashtag3);
        hashtagRepo.save(hashtag4);
        hashtagRepo.save(hashtag5);


        Restaurant restaurants1 = new Restaurant("The Cajun", seafood, "Taste the south with authentic low country boil style cooking", "https://www.cajunboilbar.com/","img/cajunboil.png", hashtag4,hashtag1);
        Restaurant restaurants2 = new Restaurant("Red Lobster", seafood, "", "https://www.redlobster.com/","img/redLobster.png", hashtag1,hashtag4);
        Restaurant restaurants3 = new Restaurant("Lalibela Ethiopian Restaurant", Africanfood, "-are served a vast array of foods, ranging from multicolored mounds of spicy stews to vegetable curries to cubes of raw ", "https://lalibelarestaurant.net/","img/africanPic2.png/",hashtag2,hashtag5,hashtag4);
        Restaurant restaurants4 = new Restaurant("Hoyo's Kitchen", Africanfood, "", "http://hoyoskitchen.com/","img/Somali Restaurant.jpg",hashtag1,hashtag5,hashtag);
        Restaurant restaurants5 = new Restaurant("Lan Viet", Asian, "", "https://lanvietmarket.com/","img/lanviet.jpg/",hashtag5, hashtag1);
        Restaurant restaurants6 = new Restaurant("Gogi Korean BBQ", Asian, "", "https://gogikbbq.com/","img/Gogi.png/",hashtag5,hashtag1,hashtag3);
        Restaurant restaurants7 = new Restaurant("Local Cantina", Mexican, "", "https://localcantina.com/","img/local-cantina-logo.png/",hashtag1,hashtag,hashtag5);
        Restaurant restaurants8 = new Restaurant("El Vaquero", Mexican, "", "https://www.mexicanrestauranthilliard.com/","img/elVaquero.jpg/",hashtag5,hashtag1);


        restaurantRepo.save(restaurants1);
        restaurantRepo.save(restaurants2);
        restaurantRepo.save(restaurants3);
        restaurantRepo.save(restaurants4);
        restaurantRepo.save(restaurants5);
        restaurantRepo.save(restaurants6);
        restaurantRepo.save(restaurants7);
        restaurantRepo.save(restaurants8);

        Review review1 = new Review("Arjin Harris", "arjinh", "Best food ever", 5, "/img/logo.png", restaurants1);
        Review review2 = new Review("Kevin Ha", "crayonEater", "It was good food but not as good as the red crayon", 4, "/img/logo.png", restaurants2);
        Review review3 = new Review("Peggy Hill","theHillDog","I really Like asian food but gogi is next level although it is a little expensive",4,"/img/logo.png",restaurants6);
        Review review4 = new Review("James bond","007","They gave me a martini shakened, not stirred", 4,"/img/logo.png",restaurants4);
        Review review5 = new Review("Arjin Harris", "arjinh", "best food ever", 5, "/img/logo.png", restaurants3);
        Review review6 = new Review("Kevin Ha", "crayonEater", "mmmmmmmmm biscuits, but not as good as the red crayon", 3, "/img/logo.png", restaurants5);
        Review review7 = new Review("Peggy Hill","theHillDog","I really Like asian food but gogi is next level although it is a little expensive",4,"/img/logo.png",restaurants7);
        Review review8 = new Review("James bond","007","They gave me a martini shakened, not stirred", 4,"/img/logo.png",restaurants8);

        reviewRepo.save(review4);
        reviewRepo.save(review2);
        reviewRepo.save(review1);
        reviewRepo.save(review3);
        reviewRepo.save(review5);
        reviewRepo.save(review6);
        reviewRepo.save(review7);
        reviewRepo.save(review8);
        restaurants4.addReview(review4);
        restaurants6.addReview(review6);
        restaurants1.addReview(review1);
        restaurants2.addReview(review2);
        restaurants3.addReview(review3);
        restaurants5.addReview(review5);
        restaurants7.addReview(review7);
        restaurants8.addReview(review8);








    }
}

