package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Review;

public interface ReviewRepo extends CrudRepository<Review,Long> {

}
