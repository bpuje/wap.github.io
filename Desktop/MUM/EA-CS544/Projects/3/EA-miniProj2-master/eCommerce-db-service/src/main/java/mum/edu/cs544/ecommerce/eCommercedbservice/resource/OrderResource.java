package mum.edu.cs544.ecommerce.eCommercedbservice.resource;

import mum.edu.cs544.ecommerce.eCommercedbservice.model.Order;
import mum.edu.cs544.ecommerce.eCommercedbservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/db/order")
public class OrderResource {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/saveOrder/{userName}/{productPrice}")
    public boolean saveOrder(@PathVariable("userName") String userName,
                             @PathVariable("productPrice") String productPrice) {

        Order order = new Order();
        order.setUserName(userName);
        order.setProductName(productPrice);
        orderRepository.save(order);
        return true;
    }
}


