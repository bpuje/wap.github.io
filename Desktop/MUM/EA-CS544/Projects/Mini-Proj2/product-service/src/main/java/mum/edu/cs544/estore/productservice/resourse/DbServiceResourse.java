package mum.edu.cs544.estore.productservice.resourse;

import mum.edu.cs544.estore.productservice.model.Item;
import mum.edu.cs544.estore.productservice.model.Product;
import mum.edu.cs544.estore.productservice.repository.ProductRepository;
import mum.edu.cs544.estore.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item")
public class DbServiceResourse {

    private Item item;

    private ProductService productService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{productId}")
    public List<Product> getCatalogProduct(Long productId) {
        return Collections.singletonList(new Product("T-Shirt", 150.0, 1000L)
        );
    }





//    @GetMapping("/{productId}")
//    public List<Product> getProducts(@PathVariable("productId") Long productId) {
//
//        List<Product> productList = Arrays.asList(
//                new Product("T-Shirt", 150.0, 1000L),
//                new Product("Hat", 100.0, 500L)
//        );
//
//        return productList.stream().map(prod -> {
//            Item item = restTemplate.getForObject("http://localhost:4551/rest/db/" + prod.getProductId(), prod.getName(), prod.getPrice(), prod.getStock(), Product.class);
//            return new Item(item.getProduct(), item.getQuantity());
//                })
//                .collect(Collectors.toList());







//        ResponseEntity<List<Long>> productResponse = restTemplate.exchange("http://db-service/rest/db" + productId, HttpMethod.GET,
//                null, new ParameterizedTypeReference<List<Long>>() {
//                });
//
//        List<Long> products = productResponse.getBody();
//        return productService.findAllProducts();


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





//    private ProductRepository productRepository;
//
//    public DbServiceResourse(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @GetMapping("/{productId}")
//    public List<Long> getAllProducts(@PathVariable("productId") final Long productId){
//        return getProductByProductId(productId);
//    }
//
//    private List<Long> getProductByProductId(@PathVariable("productId") Long productId){
//        return productRepository.findByProductId(productId)
//                .stream()
//                .map(Product::getProductId)
//                .collect(Collectors.toList());
//    }

}
