package com.example.bank_api.service;

import com.example.bank_api.model.Account;
import com.example.bank_api.model.Transaction;

import java.util.List;

public class AccountService {

    public List<Account> getAccounts() {
        return List.of(
                new Account("1", "Checking", 1200.50),
                new Account("2", "Savings", 5400.00)
        );
    }

    public List<Transaction> getTransactions() {
        return List.of(
                new Transaction("T1", "1", -100.0, "Grocery"),
                new Transaction("T2", "2", 500.0, "Salary")
        );
    }
}