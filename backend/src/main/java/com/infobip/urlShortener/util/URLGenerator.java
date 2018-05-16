package com.infobip.urlShortener.util;

import org.apache.commons.lang.RandomStringUtils;

public class URLGenerator {

  private static final String MAPPING = "register";

  private static final Integer LENGTH = 8;

  public static String generateShortURL(String requestedURL) {
    String requestedURLWithoutMapping = requestedURL.substring(requestedURL.length() - MAPPING.length());
    return requestedURLWithoutMapping + RandomStringUtils.randomAlphanumeric(LENGTH);
  }
}
