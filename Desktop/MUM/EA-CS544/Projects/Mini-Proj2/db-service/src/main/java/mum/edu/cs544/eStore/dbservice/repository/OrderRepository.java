package mum.edu.cs544.eStore.dbservice.repository;

import mum.edu.cs544.eStore.dbservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderId(Long orderId);
}
