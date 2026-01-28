package com.budgetapp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Transaction> transactions;
    private BudgetSummary summary;

    public User(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.summary = new BudgetSummary();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
        summary.updateSummary(transactions);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public BudgetSummary getSummary() {
        return summary;
    }

    public String getName() {
        return name;
    }
}
