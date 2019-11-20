package mum.edu.cs544.estore.productservice.repository;


import mum.edu.cs544.estore.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductId(Long productId);

}
