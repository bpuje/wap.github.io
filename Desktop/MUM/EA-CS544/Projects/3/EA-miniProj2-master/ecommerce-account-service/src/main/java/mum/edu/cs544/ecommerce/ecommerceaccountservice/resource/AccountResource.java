package mum.edu.cs544.ecommerce.ecommerceaccountservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/accountService")
public class AccountResource {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @GetMapping("/getAccount/{accountName}")
    public List<String> getAccountByName(@PathVariable("accountName") String accountName) {
        return restTemplate.getForObject("http://eCommerce-db-service/db/account/" + accountName, List.class);
    }
}
