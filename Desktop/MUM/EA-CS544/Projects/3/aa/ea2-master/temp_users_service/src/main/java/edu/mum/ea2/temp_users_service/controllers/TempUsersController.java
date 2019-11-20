package edu.mum.ea2.temp_users_service.controllers;

import edu.mum.shared.models.User;
import edu.mum.shared.models.UserPaymentMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class TempUsersController {

	@GetMapping("/{id}")
	public ResponseEntity<User> getById(@PathVariable(value = "id") int id) {
		System.out.println(id);

		User user = new User();
		user.setId(1);
		user.setFirstName("Rustem");
		user.setLastName("Bayetov");
		user.setEmail("rustem.bayetov@gmail.com");

		user.setAdrStreet("1000 N street");
		user.setAdrCity("Fairfield");
		user.setAdrState("Iowa");
		user.setAdrZip("52557");

		List<UserPaymentMethod> paymentMethods = new ArrayList<>();
		paymentMethods.add(UserPaymentMethod.newCreditCard("1234123412341234", "rustem bayetov", "123"));
		paymentMethods.add(UserPaymentMethod.newPayPal("rustem.bayetov"));
		paymentMethods.add(UserPaymentMethod.newBankAccount("87494684"));
		user.setPaymentMethods(paymentMethods);

		user.setPreferredPaymentMethod("cc");


		return ResponseEntity.ok(user);
	}
}
