package edu.mum.cs544.sharingcar.userservice.repository;

import edu.mum.cs544.sharingcar.userservice.entity.Driver;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends CrudRepository<Driver, Integer> {
    Driver findByUserName(String userName);
    Optional<Driver> findById(int id);
    List<Driver> findAll();
    List<Driver> findByAgeGreaterThan(int age);
}
