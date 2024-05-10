package github.com.J2ZROMERO.movies.controller;

import github.com.J2ZROMERO.movies.model.Usuario;
import github.com.J2ZROMERO.movies.repository.UserRepository;
import github.com.J2ZROMERO.movies.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody Usuario user){
        try {
            return new ResponseEntity<Usuario>(userService.addNewUser(user),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers(){
        try {

            return new ResponseEntity<List<Usuario>>(userService.allUsers(),HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getSingleUser(@PathVariable ObjectId id){
        try {

            return new ResponseEntity< Optional<Usuario>>(userService.singleUser(id),HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable ObjectId id){
        try {
            userService.deleteUser(id);

            return  ResponseEntity.ok("User deleted successfully");
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
/*
    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody Usuario user){
        try {
            Usuario userSave = userRepository.save(user);
            return new ResponseEntity<Usuario>(userSave,HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUser(@RequestBody Usuario user){
        try {
            Usuario userSave = userRepository.save(user);
            return new ResponseEntity<Usuario>(userSave,HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
