package com.codingwithtushar.accounts.controller;

import com.codingwithtushar.accounts.model.Accounts;
import com.codingwithtushar.accounts.model.Customer;
import com.codingwithtushar.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
        return accounts;
    }

    @GetMapping("account")
    public String getAccount() {
        return "Account information retreived";
    }
}
