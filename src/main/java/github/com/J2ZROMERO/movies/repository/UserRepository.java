package github.com.J2ZROMERO.movies.repository;

import github.com.J2ZROMERO.movies.model.Usuario;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Usuario, ObjectId> {
}
