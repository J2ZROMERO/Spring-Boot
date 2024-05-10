package github.com.J2ZROMERO.movies.repository;

import github.com.J2ZROMERO.movies.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
