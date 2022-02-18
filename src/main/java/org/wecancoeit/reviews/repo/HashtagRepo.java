package org.wecancoeit.reviews.repo;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.entities.Hashtag;

import java.util.Optional;

public interface HashtagRepo extends CrudRepository<Hashtag,Long> {
    Optional<Hashtag> findByName(String name);
}
