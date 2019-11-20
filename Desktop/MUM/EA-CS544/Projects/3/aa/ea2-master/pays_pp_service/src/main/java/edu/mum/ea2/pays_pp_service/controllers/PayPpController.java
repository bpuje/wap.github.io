package edu.mum.ea2.pays_pp_service.controllers;

import edu.mum.shared.models.Payment;
import edu.mum.shared.models.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pays_pp")
public class PayPpController {

	@PostMapping(value = "/pay")
	public ResponseEntity<Result> pay(@RequestBody Payment payment){

		System.out.println(payment);

		if (!payment.getType().equals("pp")) return ResponseEntity.ok().body(new Result(false, "Payment type should be PayPal: pp"));

		if (payment.getPayPalUsername().length() < 3) return ResponseEntity.ok().body(new Result(false, "Pay pal user name should be at least 3 chars length"));

		return ResponseEntity.ok().body(new Result(true, "Paid successfully using PayPal"));
	}
}
