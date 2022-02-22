package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Restaurant;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repo.FoodGenreRepo;
import org.wecancoeit.reviews.repo.HashtagRepo;
import org.wecancoeit.reviews.repo.RestaurantRepo;
import org.wecancoeit.reviews.repo.ReviewRepo;

import java.util.Optional;

@Controller
public class RestaurantController {

    private RestaurantRepo restaurantRepo;
    private FoodGenreRepo foodGenreRepo;
    private HashtagRepo hashtagRepo;
    private ReviewRepo reviewRepo;


    public RestaurantController(RestaurantRepo restaurantRepo, FoodGenreRepo foodGenreRepo, HashtagRepo hashtagRepo, ReviewRepo reviewRepo) {
        this.restaurantRepo = restaurantRepo;
        this.foodGenreRepo = foodGenreRepo;
        this.hashtagRepo = hashtagRepo;
        this.reviewRepo = reviewRepo;
    }
    @RequestMapping("/")
    public String showHome (Model model){
        model.addAttribute("genres",foodGenreRepo.findAll());
        model.addAttribute("restaurant",restaurantRepo.findById(1l));
        model.addAttribute("Hashtags",hashtagRepo.findAll());
        return "home";
    }
    @GetMapping("/restaurants/{id}")
    public String showRestaurantTemplates(Model model, @PathVariable long id){
        model.addAttribute("hashtag",hashtagRepo.findAll());
        model.addAttribute("restaurant",restaurantRepo.findAll());
        Optional<Restaurant> tempRestaurant = restaurantRepo.findById(id);
        if (( tempRestaurant).isPresent())
        {
            model.addAttribute("restaurant", tempRestaurant.get());
        }

        //try catch to redirect on a failed repo query
        try {
            System.out.println(tempRestaurant.get().getDescription());

        }
        catch (Exception ex) {
            System.out.println("Restaurant ID " + id + " does not exist");
            return "redirect:/";
        }
        return "RestaurantTemplate";
    }
@PostMapping("/restaurants/{id}")
    public String addReview(@PathVariable long id, @RequestParam String review, @RequestParam int starRating, @RequestParam String userName ){
        Restaurant restaurant = restaurantRepo.findById(id).get();
    Review review1 = new Review(userName,userName,review,starRating,"",restaurant);
    reviewRepo.save(review1);


        return"redirect:/restaurants/"+ id;

    }

}
