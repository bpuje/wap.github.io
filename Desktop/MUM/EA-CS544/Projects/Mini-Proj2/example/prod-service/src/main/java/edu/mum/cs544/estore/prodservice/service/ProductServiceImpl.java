package edu.mum.cs544.estore.prodservice.service;

import edu.mum.cs544.estore.prodservice.model.Product;
import edu.mum.cs544.estore.prodservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


}
