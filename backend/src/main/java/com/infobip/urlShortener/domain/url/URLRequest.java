package com.infobip.urlShortener.domain.url;

import lombok.Data;

@Data
public class URLRequest {

  private String url;

  private Integer redirectType;
}
