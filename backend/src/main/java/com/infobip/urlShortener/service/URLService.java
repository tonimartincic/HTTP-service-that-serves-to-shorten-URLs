package com.infobip.urlShortener.service;

import com.infobip.urlShortener.domain.url.URLRequest;
import com.infobip.urlShortener.domain.url.URLResponse;

public interface URLService {

  URLResponse register(URLRequest urlRequest, String username, String requestedURL);
}
