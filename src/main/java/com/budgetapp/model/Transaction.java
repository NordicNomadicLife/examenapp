package com.budgetapp.model;

import java.time.LocalDate;

public class Transaction {
    private double amount;
    private LocalDate date;
    private Category category;
    private TransactionType type;


    public Transaction() {}

    public Transaction(double amount, LocalDate date, Category category, TransactionType type) {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
