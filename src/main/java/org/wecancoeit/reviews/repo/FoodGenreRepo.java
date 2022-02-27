package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.FoodGenre;
import org.wecancoeit.reviews.entities.Restaurant;

import java.util.Optional;

public interface FoodGenreRepo extends CrudRepository<FoodGenre,Long> {
//    Optional<FoodGenre> findByFoodGenre(FoodGenre foodGenre);
}
