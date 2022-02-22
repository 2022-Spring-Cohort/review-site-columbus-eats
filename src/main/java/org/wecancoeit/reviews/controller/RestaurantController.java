package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancoeit.reviews.repo.FoodGenreRepo;
import org.wecancoeit.reviews.repo.RestaurantRepo;

@Controller
public class RestaurantController {

    private RestaurantRepo restaurantRepo;
    private FoodGenreRepo foodGenreRepo;


    public RestaurantController(RestaurantRepo restaurantRepo, FoodGenreRepo foodGenreRepo) {
        this.restaurantRepo = restaurantRepo;
        this.foodGenreRepo = foodGenreRepo;
    }
    @RequestMapping("/")
    public String showRestaurantTemplate (Model model){
        model.addAttribute("genres",foodGenreRepo.findAll());
        return "home";
    }


}
