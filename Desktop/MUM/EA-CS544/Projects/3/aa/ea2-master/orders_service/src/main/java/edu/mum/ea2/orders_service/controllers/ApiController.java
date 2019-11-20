package edu.mum.ea2.orders_service.controllers;

import edu.mum.shared.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/getProduct")
	public ResponseEntity<Product> getProduct() {
		Product product = new Product();
		product.setId(101);
		product.setName("Banana");

		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@GetMapping("/getProductsList")
	public ResponseEntity<List<Product>> getProductsList() {
		List<Product> products = new ArrayList<>();

		Product product1 = new Product();
		product1.setId(10001);
		product1.setName("Samsung Note 8");
		products.add(product1);

		Product product2 = new Product();
		product2.setId(10002);
		product2.setName("iPhone 11");
		products.add(product2);



		return new ResponseEntity<>(products, HttpStatus.OK);
	}

}
