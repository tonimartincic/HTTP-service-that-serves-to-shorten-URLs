package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.service.RedirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RedirectController {

  private RedirectService redirectService;

  @Autowired
  public RedirectController(RedirectService redirectService) {
    this.redirectService = redirectService;
  }

  @GetMapping("/api/{shortUrl}")
  public RedirectView getLoggedUser(@PathVariable String shortUrl) {
    return new RedirectView(this.redirectService.redirect(shortUrl));
  }
}
