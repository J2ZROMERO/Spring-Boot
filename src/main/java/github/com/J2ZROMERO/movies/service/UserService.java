package github.com.J2ZROMERO.movies.service;

import github.com.J2ZROMERO.movies.model.Usuario;
import github.com.J2ZROMERO.movies.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Usuario> allUsers(){
        return userRepository.findAll();
    }

    public Optional<Usuario> singleUser(ObjectId id){
        return userRepository.findById(id);
    }

    public Usuario addNewUser(Usuario user){
        return userRepository.save(user);
    }
    public void deleteUser(ObjectId id){
         userRepository.deleteById(id);
    }

    public Usuario updateUser(ObjectId id){


    }
}
