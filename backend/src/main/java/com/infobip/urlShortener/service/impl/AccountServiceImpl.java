package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.account.OpeningAccountResponse;
import com.infobip.urlShortener.enumeration.OpeningAccountDescription;
import com.infobip.urlShortener.repository.AccountRepository;
import com.infobip.urlShortener.service.AccountService;
import com.infobip.urlShortener.util.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public OpeningAccountResponse openAccount(String AccountId) {
        if(accountAlreadyExists(AccountId)) {
            return new OpeningAccountResponse(Boolean.FALSE, OpeningAccountDescription.ALREADY_EXISTS, null);
        }

        Account account = new Account(AccountId, PasswordGenerator.generatePassword());
        this.accountRepository.save(account);

        return new OpeningAccountResponse(Boolean.TRUE, OpeningAccountDescription.SUCCESS, account.getPassword());
    }

    private boolean accountAlreadyExists(String AccountId) {
        return this.accountRepository.findById(AccountId).isPresent();
    }
}
