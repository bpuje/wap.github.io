package mum.edu.cs544.estore.productservice.service;

import mum.edu.cs544.estore.productservice.model.Product;
import mum.edu.cs544.estore.productservice.repository.ProductRepository;
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
