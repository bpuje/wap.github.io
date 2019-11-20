package com.cs544.authservice.authservice.serviceImpl;

import com.cs544.authservice.authservice.model.User;
import com.cs544.authservice.authservice.repository.UserRepository;
import com.cs544.authservice.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        Optional<User> userDb = userRepository.findUserByUsername(user.getUsername());
        if (userDb.isEmpty()) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(user.getPassword()));
            return userRepository.save(user);
        }
        return new User();
    }
}
