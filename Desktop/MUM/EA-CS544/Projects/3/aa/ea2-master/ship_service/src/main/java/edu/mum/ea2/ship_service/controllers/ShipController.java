package edu.mum.ea2.ship_service.controllers;

import edu.mum.shared.models.Order;
import edu.mum.shared.models.Payment;
import edu.mum.shared.models.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ship")
public class ShipController {

	@PostMapping(value = "/order-placed")
	public ResponseEntity<Result> orderPlaced(@RequestBody Order order) {

		System.out.println("New order placed");
		System.out.println(order);
		System.out.println("Please ship this order ASAP");

		// You can save this info to db or do your own logic

		return ResponseEntity.ok().body(new Result(true, "Shipping service notified successfully"));
	}
}
