import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.wecancoeit.reviews.entities.Restaurants;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repo.RestaurantRepo;
import org.wecancoeit.reviews.repo.ReviewRepo;

public class Populator implements CommandLineRunner {

    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    ReviewRepo reviewRepo;
    @Override
    public void run(String... args) throws Exception {
        Restaurants restaurants1 = new Restaurants("the Cajun","seafood","Taste the south with authentic low country boil style cooking");
        Restaurants restaurants2 = new Restaurants("red lobster", "seafood","mmmmmm biscuits");
        restaurantRepo.save(restaurants1);
        restaurantRepo.save(restaurants2);


        Review review1 = new Review("Arjin Harris","arjinh","best food ever",5,"/img/logo.png",restaurants1);
        Review review2 = new Review("Kevin Ha","crayonEater","it was good food but not as good as the red crayon",4,"/img/logo.png",restaurants2);
        reviewRepo.save(review2);
        reviewRepo.save(review1);
        restaurants1.addReview(review1);
        restaurants1.addReview(review2);
        restaurants2.addReview(review1);
        restaurants2.addReview(review2);
    }
}
