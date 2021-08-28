package com.albumassignment2.Resource;

import com.albumassignment2.Model.User;
import com.albumassignment2.exception.CustomException;
import com.albumassignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@RestController
@RequestMapping("api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws CustomException{

        if (user.getName().equals("root")) {
            throw new CustomException();
        }
        else if(user.getPhotoPhotoUrl().isEmpty()){
            throw new CustomException();
        }
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/userId")
    public void getUserById(@RequestParam("userId") String userId) throws NoSuchElementException {
        if (userId.equals("55555")) {
            throw new NoSuchElementException();
        }
        userService.getUserById(userId);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name ="userId") String userId ){
        userService.deleteUser(userId);
    }
}
