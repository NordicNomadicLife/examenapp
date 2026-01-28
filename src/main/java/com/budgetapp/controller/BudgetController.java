package com.budgetapp.controller;

import com.budgetapp.model.*;
import com.budgetapp.model.User;
import com.budgetapp.model.Transaction;
import com.budgetapp.model.Category;


import java.time.LocalDate;
import java.util.Scanner;

public class BudgetController {
    private User user;
    private Scanner scanner;

    public BudgetController() {
        this.user = new User("Demo User");
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Välkommen till BudgetApp!");
        while (true) {
            System.out.println("\n1. Lägg till transaktion\n2. Visa översikt\n3. Avsluta");
            int val = Integer.parseInt(scanner.nextLine());

            switch (val) {
                case 1 -> addTransaction();
                case 2 -> showSummary();
                case 3 -> System.exit(0);
                default -> System.out.println("Ogiltigt val.");
            }
        }
    }

    private void addTransaction() {
        System.out.print("Belopp: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Typ (income/expense): ");
        String typeStr = scanner.nextLine();
        TransactionType type = typeStr.equalsIgnoreCase("income") ?
                TransactionType.INCOME : TransactionType.EXPENSE;

        System.out.print("Kategori: ");
        String cat = scanner.nextLine();

        Transaction t = new Transaction(amount, LocalDate.now(), new Category(cat), type);
        user.addTransaction(t);
        System.out.println("Transaktion tillagd!");
    }

    private void showSummary() {
        BudgetSummary s = user.getSummary();
        System.out.printf("Inkomst: %.2f Kr\n", s.getTotalIncome());
        System.out.printf("Utgifter: %.2f Kr\n", s.getTotalExpenses());
        System.out.printf("Sparande: %.2f Kr\n", s.getSavings());
    }
}
