package mum.edu.cs544.ecommerce.ecommerceorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("mum.edu.cs544.ecommerce.ecommerceorderservice")
@SpringBootApplication
public class EcommerceOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceOrderServiceApplication.class, args);
    }

}
