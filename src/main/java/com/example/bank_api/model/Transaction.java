package com.example.bank_api.model;


public class Transaction {
    private String id;
    private String accountId;
    private double amount;
    private String description;

    public Transaction(String id, String accountId, double amount, String description) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
        this.description = description;
    }

    public String getId() { return id; }
    public String getAccountId() { return accountId; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
}