package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.url.URLRequest;
import com.infobip.urlShortener.domain.url.URLResponse;
import com.infobip.urlShortener.repository.URLRepository;
import com.infobip.urlShortener.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLServiceImpl implements URLService {

  private URLRepository urlRepository;

  @Autowired
  public URLServiceImpl(URLRepository urlRepository) {
      this.urlRepository = urlRepository;
  }

  @Override
  public URLResponse register(URLRequest urlRequest) {
    return null;
  }
}
