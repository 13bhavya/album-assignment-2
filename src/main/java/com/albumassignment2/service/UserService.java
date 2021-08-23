package com.albumassignment2.service;

import com.albumassignment2.Model.User;
import com.albumassignment2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User saveuser(User user) {
        return userRepository.save(user);
    }

    public void getuserbyId(String userId) {
        userRepository.findById(userId);
    }

    public List<User> getAlluser() {
        return userRepository.findAll();
    }

    public User updateuser(User user) {
        return userRepository.save(user);
    }

    public void deleteuser(String userId) {
        userRepository.deleteById(userId);
    }
}
