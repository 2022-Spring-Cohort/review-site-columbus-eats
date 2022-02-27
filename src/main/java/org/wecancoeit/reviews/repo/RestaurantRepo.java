package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Restaurant;

import java.util.Optional;

public interface RestaurantRepo extends CrudRepository<Restaurant, Long> {

Optional<Restaurant> findByFoodGenre(String foodGenre);


}
