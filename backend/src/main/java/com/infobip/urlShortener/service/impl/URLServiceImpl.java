package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.domain.url.URL;
import com.infobip.urlShortener.domain.url.URLRequest;
import com.infobip.urlShortener.domain.url.URLResponse;
import com.infobip.urlShortener.repository.AccountRepository;
import com.infobip.urlShortener.repository.URLRepository;
import com.infobip.urlShortener.service.URLService;
import com.infobip.urlShortener.util.URLGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLServiceImpl implements URLService {

  private AccountRepository accountRepository;

  private URLRepository urlRepository;

  @Autowired
  public URLServiceImpl(URLRepository urlRepository, AccountRepository accountRepository) {
      this.urlRepository = urlRepository;
      this.accountRepository = accountRepository;
  }

  @Override
  public URLResponse register(URLRequest urlRequest, String username, String requestedURL) {
    Account account = this.accountRepository.findByUsername(username);
    URL url = new URL(urlRequest);
    url.setAccount(account);
    url.setShortUrl(URLGenerator.generateShortURL(requestedURL));

    return getURLResponse(this.urlRepository.save(url));
  }

  private URLResponse getURLResponse(URL url) {
    return new URLResponse(url);
  }
}
