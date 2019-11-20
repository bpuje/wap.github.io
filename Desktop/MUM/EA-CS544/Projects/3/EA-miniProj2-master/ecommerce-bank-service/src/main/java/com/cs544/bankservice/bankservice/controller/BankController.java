package com.cs544.bankservice.bankservice.controller;

import com.cs544.bankservice.bankservice.model.Receipt;
import com.cs544.bankservice.bankservice.model.Transaction;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin
@RequestMapping("/api/bank")
public class BankController {

    @PostMapping("/validate")
    public Receipt validateBank(@RequestBody Transaction transaction) {
        try {
            if (!transaction.getBankNumber().isEmpty() || transaction.getBankNumber() != null) {
                return new Receipt(transaction.getFirstName(), transaction.getLastName(),
                        LocalDate.now(), "Transaction Succeeded!");
            }
        } catch (Exception ex) {
            return new Receipt();
        }
        return new Receipt();
    }
}
