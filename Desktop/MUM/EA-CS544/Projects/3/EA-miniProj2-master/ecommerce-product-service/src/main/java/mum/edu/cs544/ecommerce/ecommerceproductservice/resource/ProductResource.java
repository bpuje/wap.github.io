package mum.edu.cs544.ecommerce.ecommerceproductservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/productService")
public class ProductResource {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @GetMapping("/getProductByName/{productName}")
    public List<String> getProductByName(@PathVariable("productName") String productName) {
        return restTemplate.getForObject("http://eCommerce-db-service/db/product/" + productName, List.class);
    }

}
