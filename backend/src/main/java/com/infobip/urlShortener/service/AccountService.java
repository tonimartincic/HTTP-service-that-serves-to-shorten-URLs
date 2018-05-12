package com.infobip.urlShortener.service;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountRequest;
import com.infobip.urlShortener.domain.account.openingAccount.OpeningAccountResponse;

public interface AccountService {

  OpeningAccountResponse openAccount(OpeningAccountRequest openingAccountRequest);

  Account validate(Account account);
}
