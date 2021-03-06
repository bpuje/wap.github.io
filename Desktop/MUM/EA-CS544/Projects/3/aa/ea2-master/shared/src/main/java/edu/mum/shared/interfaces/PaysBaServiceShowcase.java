package edu.mum.shared.interfaces;

import edu.mum.shared.models.Payment;
import edu.mum.shared.models.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface PaysBaServiceShowcase {

	@RequestMapping("/pays_ba/pay")
	ResponseEntity<Result> pay(@RequestBody Payment payment);

}
