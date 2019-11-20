package edu.mum.cs544.sharingcar.userservice.repository;

import edu.mum.cs544.sharingcar.userservice.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserName(String userName);
    Optional<User> findById(int id);
    List<User> findAll();
    List<User> findByAgeGreaterThan(int age);
}
