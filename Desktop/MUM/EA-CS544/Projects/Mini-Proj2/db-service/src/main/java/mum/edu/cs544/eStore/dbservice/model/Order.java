package mum.edu.cs544.eStore.dbservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders", catalog = "test")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private Long orderId;

    private User user;


    @Column(name = "orderName")
    private String orderName;

    @ManyToOne
    @Column(name = "products")
    List<Product> products;

    @Column(name = "order")
    private String order;


    public Order() {
    }


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
