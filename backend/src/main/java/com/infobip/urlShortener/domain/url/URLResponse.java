package com.infobip.urlShortener.domain.url;

import lombok.Data;

@Data
public class URLResponse {

  private String shortUrl;

  public URLResponse(URL url) {
    this.shortUrl = url.getShortUrl();
  }
}
