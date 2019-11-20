package mum.edu.cs544.ecommerce.eCommercedbservice.resource;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Product;
import mum.edu.cs544.ecommerce.eCommercedbservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/db/product")
public class ProductResource {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("{productName}")
    public List<String> getProductPrice(@PathVariable("productName") String productName) {
        List<Product> productList = productRepository.findByName(productName);
        List<String> prices = new ArrayList<String>();
        for (Product product : productList) {
            prices.add(product.getPrice());
        }
        return prices;
    }
}
