package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.url.URL;
import com.infobip.urlShortener.repository.URLRepository;
import com.infobip.urlShortener.service.RedirectService;
import com.infobip.urlShortener.util.URLGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedirectServiceImpl implements RedirectService {

  private URLRepository urlRepository;

  @Autowired
  public RedirectServiceImpl(URLRepository urlRepository) {
    this.urlRepository = urlRepository;
  }

  @Override
  public URL redirect(String shortUrl, String requestedURL) {
    URL url = this.urlRepository.findByShortUrl(requestedURL);

    if(url == null) {
      return null;
    }

    url.setNumberOfRedirects(url.getNumberOfRedirects() + 1);
    this.urlRepository.save(url);

    return url;
  }
}
