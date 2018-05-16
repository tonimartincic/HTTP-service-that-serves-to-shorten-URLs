package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.domain.url.URL;
import com.infobip.urlShortener.service.RedirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RedirectController {

  private RedirectService redirectService;

  @Autowired
  public RedirectController(RedirectService redirectService) {
    this.redirectService = redirectService;
  }

  @GetMapping("/api/{shortUrl}")
  public RedirectView getLoggedUser(@PathVariable String shortUrl, HttpServletRequest request) {
    String requestedURL = request.getRequestURL().toString();
    URL url = this.redirectService.redirect(shortUrl, requestedURL);

    RedirectView redirectView = new RedirectView(url.getValue());
    redirectView.setStatusCode(HttpStatus.valueOf(url.getRedirectType().getValue()));
    return redirectView;
  }
}
