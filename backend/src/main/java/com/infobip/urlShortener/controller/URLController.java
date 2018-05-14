package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.domain.url.URLRequest;
import com.infobip.urlShortener.domain.url.URLResponse;
import com.infobip.urlShortener.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLController {

  private URLService urlService;

  @Autowired
  public URLController(URLService urlService) {
      this.urlService = urlService;
  }

  @PostMapping("/api/register")
  public URLResponse register(@RequestBody final URLRequest urlRequest) {
      return this.urlService.register(urlRequest);
  }
}
