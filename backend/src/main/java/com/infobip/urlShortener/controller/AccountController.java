package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountRequest;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountResponse;
import com.infobip.urlShortener.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AccountController {

  private AccountService accountService;

  @Autowired
  public AccountController(AccountService accountService) {
      this.accountService = accountService;
  }

  @PostMapping("/api/account")
  public OpeningAccountResponse openAccount(@RequestBody final OpeningAccountRequest openingAccountRequest) {
      return this.accountService.openAccount(openingAccountRequest);
  }

  @GetMapping("/api/account")
  public Account getLoggedUser(Principal principal) {
    if(principal == null) {
      return null;
    }

    return this.accountService.getAccountByUsername(principal.getName());
  }
}
