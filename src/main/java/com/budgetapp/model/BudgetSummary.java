package com.budgetapp.model;

import java.util.List;

public class BudgetSummary {
    private double totalIncome;
    private double totalExpenses;
    private double savings;

    public void updateSummary(List<Transaction> transactions) {
        totalIncome = 0;
        totalExpenses = 0;

        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.INCOME) {
                totalIncome += t.getAmount();
            } else {
                totalExpenses += t.getAmount();
            }
        }

        savings = totalIncome - totalExpenses;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public double getSavings() {
        return savings;
    }
}
