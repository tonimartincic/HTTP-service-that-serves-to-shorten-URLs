package com.infobip.urlShortener.repository;

import com.infobip.urlShortener.domain.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

  Account findByUsername(String username);
}
