package com.cs544.creditservice.creditservice.controller;

import com.cs544.creditservice.creditservice.model.Receipt;
import com.cs544.creditservice.creditservice.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/credit")
@CrossOrigin
public class CreditController {

    @PostMapping("/validate")
    public Receipt validateCredit(@RequestBody Transaction transaction) throws Exception {
        try {
            if (!transaction.getCsv().isEmpty() || transaction.getCsv() != null) {
                return new Receipt(transaction.getFirstName(), transaction.getLastName(),
                        LocalDate.now(), "Transaction Succeeded!");
            }
        } catch (Exception ex) {
            return new Receipt();
        }
        return new Receipt();
    }
}
