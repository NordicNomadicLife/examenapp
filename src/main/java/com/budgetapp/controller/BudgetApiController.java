package com.budgetapp.controller;

import com.budgetapp.model.BudgetSummary;
import com.budgetapp.model.Transaction;
import com.budgetapp.model.User;
import com.budgetapp.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class BudgetApiController {

    private final User user = new User("Demo User");

    @PostMapping("/transaction")
    public void addTransaction(@RequestBody Transaction t) {
        user.addTransaction(t);
    }

    @GetMapping("/summary")
    public BudgetSummary getSummary() {
        return user.getSummary();
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return new ArrayList<>(user.getTransactions());
    }
}
