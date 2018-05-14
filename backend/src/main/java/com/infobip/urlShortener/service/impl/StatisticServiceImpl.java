package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.url.URL;
import com.infobip.urlShortener.repository.AccountRepository;
import com.infobip.urlShortener.repository.URLRepository;
import com.infobip.urlShortener.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StatisticServiceImpl implements StatisticService {

  private URLRepository urlRepository;

  private AccountRepository accountRepository;

  @Autowired
  public StatisticServiceImpl(URLRepository urlRepository, AccountRepository accountRepository) {
    this.urlRepository = urlRepository;
    this.accountRepository = accountRepository;
  }

  @Override
  public Map<String, Long> getStatistics(String AccountId) {
    Account account = this.accountRepository.findByUsername(AccountId);
    List<URL> urls = this.urlRepository.findAllByAccount(account);

    return urls.stream().collect(Collectors.toMap(URL::getValue, URL::getNumberOfRedirects));
  }
}
