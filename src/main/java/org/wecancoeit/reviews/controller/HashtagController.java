package org.wecancoeit.reviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repo.HashtagRepo;
import org.wecancoeit.reviews.repo.RestaurantRepo;
import org.wecancoeit.reviews.repo.ReviewRepo;

@Controller
public class HashtagController {

    private RestaurantRepo restaurantRepo;
    private ReviewRepo reviewRepo;
    private HashtagRepo hashtagRepo;

    public HashtagController(RestaurantRepo restaurantRepo, ReviewRepo reviewRepo, HashtagRepo hashtagRepo) {
        this.restaurantRepo = restaurantRepo;
        this.reviewRepo = reviewRepo;
        this.hashtagRepo = hashtagRepo;

    }

    @RequestMapping("/hashtags/{id}")
    public String showHome(Model model, @PathVariable Long id) {
        model.addAttribute("hashtag", hashtagRepo.findById(id).get());
//        model.addAttribute("restaurant", restaurantRepo.findById(id).get());
        return "hashTag";
    }
}
