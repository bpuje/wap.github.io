package mum.edu.cs544.ecommerce.eCommercedbservice.repository;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
