package edu.mum.cs544.estore.prodservice.repository;


import edu.mum.cs544.estore.prodservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductId(Long productId);

}
