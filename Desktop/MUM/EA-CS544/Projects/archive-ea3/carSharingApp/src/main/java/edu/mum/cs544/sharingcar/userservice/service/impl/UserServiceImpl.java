package edu.mum.cs544.sharingcar.userservice.service.impl;

import edu.mum.cs544.sharingcar.userservice.entity.User;
import edu.mum.cs544.sharingcar.userservice.repository.UserRepository;
import edu.mum.cs544.sharingcar.userservice.service.UserService;
import jnr.ffi.annotations.In;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public void deleteUserById(Integer userId) {
        userRepository.deleteById(userId);
    }
}
