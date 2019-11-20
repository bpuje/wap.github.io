package mum.edu.cs544.ecommerce.ecommerceorderservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/oderService")
public class OrderResource {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @GetMapping("/{userName}/{productName}")
    public void placeOrder(@PathVariable("userName") String userName
            , @PathVariable("productName") String productName) {

        List<String> userData = restTemplate.getForObject("http://ecommerce-user-service/db/user/" + userName, List.class);

        List<String> productPrice = restTemplate.getForObject("http://ecommerce-product-service/db/productService/getProductByName" + productName, List.class);

        System.out.println(productPrice + " " + userData);
        restTemplate.getForObject("http://eCommerce-db-service/db/order/saveOrder" + userData.get(0) + "/" + productPrice.get(0), Object.class);
    }
}
