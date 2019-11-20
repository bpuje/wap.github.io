package mum.edu.cs544.ecommerce.eCommercedbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = "mum.edu.cs544.ecommerce.eCommercedbservice.repository")
@ComponentScan(basePackages = "mum.edu.cs544.ecommerce.eCommercedbservice")
@SpringBootApplication
public class ECommerceDbServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceDbServiceApplication.class, args);
    }

}
