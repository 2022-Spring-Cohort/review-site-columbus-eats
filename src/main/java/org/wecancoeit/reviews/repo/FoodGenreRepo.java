package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.FoodGenre;

public interface FoodGenreRepo extends CrudRepository<FoodGenre,Long> {

}
