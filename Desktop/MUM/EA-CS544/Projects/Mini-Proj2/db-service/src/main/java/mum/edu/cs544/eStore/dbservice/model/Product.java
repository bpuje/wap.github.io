package mum.edu.cs544.eStore.dbservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product", catalog = "ecomm")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock")
    private Long stock;

    @Column(name = "items")
    private List<Item> items;

    public Product() {
    }

    public Product(String name, Double price, Long stock, List<Item> items) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.items = items;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
