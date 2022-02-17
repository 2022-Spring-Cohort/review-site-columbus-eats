package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.entities.Restaurants;
import org.wecancoeit.reviews.repo.RestaurantRepo;
import org.wecancoeit.reviews.entities.Review;

@Controller
public class RestaurantController {

    private RestaurantRepo restaurantRepo;

    public RestaurantController(RestaurantRepo restaurantRepo) {
        this.restaurantRepo = restaurantRepo;
    }
    @RequestMapping("/")
    public String showRestaurantTemplate (Model model){
        model.addAttribute("Restaurants",restaurantRepo.findAll());
        return "RestaurantTemplate";
    }


}
