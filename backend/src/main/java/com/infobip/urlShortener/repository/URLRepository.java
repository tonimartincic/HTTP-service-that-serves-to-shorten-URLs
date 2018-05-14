package com.infobip.urlShortener.repository;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.url.URL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface URLRepository extends CrudRepository<URL, Long> {

  List<URL> findAllByAccount(Account account);
}
