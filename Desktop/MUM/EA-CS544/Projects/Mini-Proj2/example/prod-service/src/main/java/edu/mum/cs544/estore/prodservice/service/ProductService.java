package edu.mum.cs544.estore.prodservice.service;



import edu.mum.cs544.estore.prodservice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product saveProduct(Product product);
}
