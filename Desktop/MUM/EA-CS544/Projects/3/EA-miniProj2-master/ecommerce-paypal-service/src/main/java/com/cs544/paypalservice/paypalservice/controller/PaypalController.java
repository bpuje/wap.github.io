package com.cs544.paypalservice.paypalservice.controller;

import com.cs544.paypalservice.paypalservice.model.Receipt;
import com.cs544.paypalservice.paypalservice.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin
@RequestMapping("/api/paypal")
public class PaypalController {

    @PostMapping("/validate")
    public Receipt validatePaypal(@RequestBody Transaction transaction) throws Exception{
        try {
            if (!transaction.getUsername().isEmpty() || transaction.getUsername() != null) {
                return new Receipt(transaction.getFirstName(), transaction.getLastName(),
                        LocalDate.now(), "Transaction Succeeded!");
            }
        } catch (Exception ex) {
            return new Receipt();
        }
        return new Receipt();
    }
}
