package com.hcltech;

import java.util.*;

public class Transaction {
    private double amount;
    private String type; // "credit" or "debit"

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return type + ": " + amount;
    }

    // Dummy data
    public static List<Transaction> getDummyTransactions() {
        return Arrays.asList(
                new Transaction(100, "credit"),
                new Transaction(50, "debit"),
                new Transaction(200, "credit"),
                new Transaction(70, "debit"),
                new Transaction(500, "credit")
        );
    }
}

