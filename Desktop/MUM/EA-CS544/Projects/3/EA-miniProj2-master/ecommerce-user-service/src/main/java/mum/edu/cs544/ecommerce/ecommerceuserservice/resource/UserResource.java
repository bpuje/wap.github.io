package mum.edu.cs544.ecommerce.ecommerceuserservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/userService")
public class UserResource {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @GetMapping("/getUser/{custUserName}")
    public List<String> getUserByName(@PathVariable("custUserName") String custUserName) {
        return restTemplate.getForObject("http://eCommerce-db-service/db/user/" + custUserName, List.class);
    }
}
