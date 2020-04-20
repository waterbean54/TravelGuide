package com.travel.guide.account.controller;

import com.travel.guide.account.model.Account;
import com.travel.guide.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/create")
    public Account create() {
        Account account = new Account();
        account.setId_email("test@gmail.com");
        account.setPw_password("passwird");

        return accountService.createAccount(account);
    }
}
