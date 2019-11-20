package edu.mum.ea2.pays_cc_service.controllers;

import edu.mum.shared.models.Payment;
import edu.mum.shared.models.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pays_cc")
public class PayCcController {

	@PostMapping(value = "/pay")
	public ResponseEntity<Result> pay(@RequestBody Payment payment){

		System.out.println(payment);

		if (!payment.getType().equals("cc")) return ResponseEntity.ok().body(new Result(false, "Payment type should be Credit Card: cc"));

		if (payment.getCardNumber().length() != 16) return ResponseEntity.ok().body(new Result(false, "Credit card number should be 16 chars length"));

		if (payment.getHolderName().length() < 3) return ResponseEntity.ok().body(new Result(false, "Credit card holder name should be at least 3 chars length"));

		if (payment.getCvc().length() != 3) return ResponseEntity.ok().body(new Result(false, "Credit card cvc should be 3 chars length"));

		return ResponseEntity.ok().body(new Result(true, "Paid successfully using credit card"));
	}
}
