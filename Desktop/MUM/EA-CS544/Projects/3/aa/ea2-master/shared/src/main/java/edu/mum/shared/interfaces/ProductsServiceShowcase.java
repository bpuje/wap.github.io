package edu.mum.shared.interfaces;

import edu.mum.shared.models.Product;
import edu.mum.shared.models.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductsServiceShowcase {

	@GetMapping("/products/{id}")
	Product findById(@PathVariable(value = "id") int id);

	@GetMapping("/products/")
	List<Product> findAll();

	@PostMapping("/products/")
	ResponseEntity<Result> add(Product model);

	@DeleteMapping("/products/{id}")
	ResponseEntity<Result> deleteProduct(@PathVariable(name = "id") int id);

	@PostMapping("/products/decrease/{id}/{quantity}")
	ResponseEntity<Result> decreaseAvailableCount(@PathVariable(name = "id") int id, @PathVariable(name = "quantity") int quantity);

	@PostMapping("/products/increase/{id}/{quantity}")
	ResponseEntity<Result> increaseAvailableCount(@PathVariable(name = "id") int id, @PathVariable(name = "quantity") int quantity);
}
