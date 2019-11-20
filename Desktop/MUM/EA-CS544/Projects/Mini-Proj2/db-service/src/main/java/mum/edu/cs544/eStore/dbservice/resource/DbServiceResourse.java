package mum.edu.cs544.eStore.dbservice.resource;

import mum.edu.cs544.eStore.dbservice.model.Order;
import mum.edu.cs544.eStore.dbservice.model.Product;
import mum.edu.cs544.eStore.dbservice.repository.OrderRepository;
import mum.edu.cs544.eStore.dbservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResourse {

    @Autowired
    private ProductRepository productRepository;

    private OrderRepository orderRepository;

    public DbServiceResourse(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @GetMapping("/getAllProduct")
    public List<Product> getAllProducts(){
        return productRepository.findAllProducts();
    }

//    @GetMapping("/{productId}")
//    public List<Long> getAllProducts(@PathVariable("productId") final Long productId){
//        return getProductByProductid(productId);
//    }
//
//    @GetMapping("/{orderName}")
//    public List<Long> getOrders(@PathVariable("orderName") final Long orderId){
//        return getOrderByOrderId(orderId);
//    }
//
//
//
//    private List<Long> getProductByProductid(@PathVariable ("producId") Long productId){
//        return productRepository.findByProductId(productId)
//                .stream()
//                .map(product -> product.getProductId())
//                .collect(Collectors.toList());
//    }
//
//    private List<Long> getOrderByOrderId(@PathVariable("orderId") Long orderId){
//        return orderRepository.findByOrderId(orderId)
//                .stream()
//                .map(Order::getOrderId)
//                .collect(Collectors.toList());
//    }
}
