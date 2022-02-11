package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RestaurantController {
    @RequestMapping("/")
    public String showRestaurantsTemplate(){
        return "restaurantTemplate";
    }
}
