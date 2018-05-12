package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountRequest;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountResponse;
import com.infobip.urlShortener.enumeration.OpeningAccountDescription;
import com.infobip.urlShortener.repository.AccountRepository;
import com.infobip.urlShortener.service.AccountService;
import com.infobip.urlShortener.util.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

  private AccountRepository accountRepository;

  @Autowired
  public AccountServiceImpl(AccountRepository accountRepository) {
      this.accountRepository = accountRepository;
  }

  @Override
  public OpeningAccountResponse openAccount(OpeningAccountRequest openingAccountRequest) {
      if(accountAlreadyExists(openingAccountRequest.getAccountId())) {
          return new OpeningAccountResponse(Boolean.FALSE, OpeningAccountDescription.ALREADY_EXISTS, null);
      }

      Account account = new Account(openingAccountRequest.getAccountId(), PasswordGenerator.generatePassword());
      this.accountRepository.save(account);

      return new OpeningAccountResponse(Boolean.TRUE, OpeningAccountDescription.SUCCESS, account.getPassword());
  }

  private boolean accountAlreadyExists(String AccountId) {
        return this.accountRepository.findById(AccountId).isPresent();
  }

  @Override
  public Account validate(Account account) {
    return this.accountRepository.findByIdAndPassword(account.getId(), account.getPassword());
  }
}
