package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.FoodGenre;
import org.wecancoeit.reviews.entities.Restaurant;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repo.FoodGenreRepo;
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
    @Override
    public void run(String... args) throws Exception {
        FoodGenre seafood= new FoodGenre("seafood","stuff from the ocean","/img/cajun.png");
        foodGenreRepo.save(seafood);
        FoodGenre Africanfood= new FoodGenre("Africanfood","stuff from back home","/img/AfricanLogo.png");
        foodGenreRepo.save(Africanfood);

        Restaurant restaurants1 = new Restaurant("the Cajun",seafood,"Taste the south with authentic low country boil style cooking");
        Restaurant restaurants2 = new Restaurant("red lobster", seafood,"mmmmmm biscuits");
        Restaurant restaurants5 = new Restaurant("Lalibela",Africanfood,"Lamb");
        Restaurant restaurants6 = new Restaurant("HabeshaGarden",Africanfood,"goatmeat");

        restaurantRepo.save(restaurants1);
        restaurantRepo.save(restaurants2);
        restaurantRepo.save(restaurants5);
        restaurantRepo.save(restaurants6);



        Review review1 = new Review("Arjin Harris","arjinh","best food ever",5,"/img/logo.png",restaurants1);
        Review review2 = new Review("Kevin Ha","crayonEater","it was good food but not as good as the red crayon",4,"/img/logo.png",restaurants2);
        reviewRepo.save(review2);
        reviewRepo.save(review1);
        restaurants1.addReview(review1);
        restaurants1.addReview(review2);
        restaurants2.addReview(review1);
        restaurants2.addReview(review2);
    }
}
