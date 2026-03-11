package com.example.bank_api.controller;


import com.example.bank_api.model.Account;
import com.example.bank_api.model.Transaction;
import com.example.bank_api.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService = new AccountService();

    @GetMapping("/accounts")
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    @GetMapping("/transactions")
    public List<Transaction> getTransactions() {
        return accountService.getTransactions();
    }
}