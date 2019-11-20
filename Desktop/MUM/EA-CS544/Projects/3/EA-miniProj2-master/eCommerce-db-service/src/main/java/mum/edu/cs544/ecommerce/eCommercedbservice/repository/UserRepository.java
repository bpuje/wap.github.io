package mum.edu.cs544.ecommerce.eCommercedbservice.repository;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUserName(String userName);
}
