package mum.edu.cs544.ecommerce.ecommerceuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan("mum.edu.cs544.ecommerce.ecommerceuserservice")
@SpringBootApplication
public class EcommerceUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceUserServiceApplication.class, args);
    }

}
