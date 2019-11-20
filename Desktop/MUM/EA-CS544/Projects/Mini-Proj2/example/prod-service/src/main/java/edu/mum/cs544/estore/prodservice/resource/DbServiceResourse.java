package edu.mum.cs544.estore.prodservice.resource;

import edu.mum.cs544.estore.prodservice.model.Item;
import edu.mum.cs544.estore.prodservice.model.Product;
import edu.mum.cs544.estore.prodservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/item")
public class DbServiceResourse {

    private Item item;

    private ProductService productService;


    private RestTemplate restTemplate;

    @GetMapping("/{productId}")
    public List<Product> getCatalogProduct(Long productId) {
        return Collections.singletonList(new Product("T-Shirt", 150.0, 1000L)
        );
    }




    @GetMapping("/products")
    public List<Product> getListProduct(){
        List<Product> productList = productService.findAllProducts();
        return productList;
    }

    @GetMapping("/saveProduct")
    public ResponseEntity<Product> saveNewProduct(@RequestBody Product product){
        Product productObj = productService.saveProduct(product);
        return new ResponseEntity<>(productObj, HttpStatus.CREATED);
    }


}
