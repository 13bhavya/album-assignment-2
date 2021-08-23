package com.albumassignment2.Resource;

import com.albumassignment2.Model.User;
import com.albumassignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("userId")
    public void getUserById(@RequestParam("userId") String userId){
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
