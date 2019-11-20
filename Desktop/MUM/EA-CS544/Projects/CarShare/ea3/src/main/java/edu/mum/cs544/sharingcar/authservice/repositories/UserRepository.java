package edu.mum.cs544.sharingcar.authservice.repositories;

import edu.mum.cs544.sharingcar.authservice.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByEmail(String email);
    UserEntity findById(int id);
}
