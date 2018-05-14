package com.infobip.urlShortener.util;

import org.apache.commons.lang.RandomStringUtils;

public class URLGenerator {

  public static final String URL_FIRST_PART = "http://localhost:3000/";

  private static final Integer LENGTH = 8;

  public static String generateShortURL() {
    return URL_FIRST_PART + RandomStringUtils.randomAlphanumeric(LENGTH);
  }
}
