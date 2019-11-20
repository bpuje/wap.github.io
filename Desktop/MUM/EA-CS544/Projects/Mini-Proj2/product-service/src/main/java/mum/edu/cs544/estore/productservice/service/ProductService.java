package mum.edu.cs544.estore.productservice.service;

import mum.edu.cs544.estore.productservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product saveProduct(Product product);
}
