package mum.edu.cs544.ecommerce.eCommercedbservice.repository;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(String productName);
}
