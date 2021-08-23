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
    public User saveuser(@RequestBody User user){
        return userService.saveuser(user);
    }

    @GetMapping
    public List<User> getAlluser(){
        return userService.getAlluser();
    }

    @GetMapping("userId")
    public void getuserById(@RequestParam("userId") String userId){
        userService.getuserbyId(userId);
    }

    @PutMapping
    public User updateuser(@RequestBody User user){
        return userService.updateuser(user);
    }

    @DeleteMapping
    public void deleteuser(@RequestParam(name ="userId") String userId ){
        userService.deleteuser(userId);
    }
}
