package com.infobip.urlShortener.controller;

import com.infobip.urlShortener.domain.account.OpeningAccountResponse;
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

    @PostMapping("api/register")
    public OpeningAccountResponse register(@RequestBody final String AccountId) {
        return this.urlService.register(AccountId);
    }
}
