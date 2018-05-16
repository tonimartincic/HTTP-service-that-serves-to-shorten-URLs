package com.infobip.urlShortener.service;

import com.infobip.urlShortener.domain.url.URL;

public interface RedirectService {

  URL redirect(String shortUrl, String requestedURL);
}
