package com.RangManchMaithili.RangmanchMaithili.service;

import com.RangManchMaithili.RangmanchMaithili.entities.User;
import com.RangManchMaithili.RangmanchMaithili.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public UserService(UserRepo userRepository){
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        User newUser = new User();
        newUser.setUserId(user.getUserId());
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);
    }
    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("user not found"));
    }

}
