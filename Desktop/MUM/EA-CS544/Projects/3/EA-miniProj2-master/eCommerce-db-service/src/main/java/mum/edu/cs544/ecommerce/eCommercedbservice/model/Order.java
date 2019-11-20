package mum.edu.cs544.ecommerce.eCommercedbservice.model;

import javax.persistence.*;

@Entity
//@Table(name = "order_detail", catalog = "test")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "userName")
    private String userName;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
