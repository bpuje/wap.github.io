package com.cs544.authservice.authservice.repository;

import com.cs544.authservice.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findUserByUsername(String username);
}
