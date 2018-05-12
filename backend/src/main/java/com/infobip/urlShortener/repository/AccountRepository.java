package com.infobip.urlShortener.repository;

import com.infobip.urlShortener.domain.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {

  Account findByIdAndPassword(String id, String password);
}
