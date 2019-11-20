package edu.mum.cs544.sharingcar.userservice.service;

import edu.mum.cs544.sharingcar.userservice.entity.User;

import java.util.List;

public interface UserService {

    Iterable<User> getAllUsers();
    User saveUser(User user);
    User getUserById(Integer userId);
    void deleteUserById(Integer userId);
}
