package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Restaurants;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepo extends CrudRepository<Restaurants, Long> {
Optional<Restaurants> findByGenre(String foodGenre);


}
