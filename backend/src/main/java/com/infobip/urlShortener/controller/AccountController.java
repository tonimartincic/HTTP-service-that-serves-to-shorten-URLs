package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountRequest;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountResponse;
import com.infobip.urlShortener.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  private AccountService accountService;

  @Autowired
  public AccountController(AccountService accountService) {
      this.accountService = accountService;
  }

  @PostMapping("api/account")
  public OpeningAccountResponse openAccount(@RequestBody final OpeningAccountRequest openingAccountRequest) {
      return this.accountService.openAccount(openingAccountRequest);
  }

  @PostMapping("api/account/validate")
  public Account validate(@RequestBody final Account account) {
    return this.accountService.validate(account);
  }
}
