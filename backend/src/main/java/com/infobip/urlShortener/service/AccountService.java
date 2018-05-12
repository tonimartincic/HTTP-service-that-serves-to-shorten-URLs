package com.infobip.urlShortener.service;

import com.infobip.urlShortener.domain.account.OpeningAccountResponse;

public interface AccountService {

    OpeningAccountResponse openAccount(String AccountId);
}
