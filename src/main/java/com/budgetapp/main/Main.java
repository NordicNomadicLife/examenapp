package com.budgetapp.main;

import com.budgetapp.controller.BudgetController;

public class Main {
    public static void main(String[] args) {
        BudgetController controller = new BudgetController();
        controller.run();
    }
}
