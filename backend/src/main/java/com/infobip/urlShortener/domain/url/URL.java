package com.infobip.urlShortener.domain.url;

import com.infobip.urlShortener.enumeration.RedirectType;
import com.infobip.urlShortener.util.URLGenerator;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class URL {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String value;

  @Enumerated(EnumType.STRING)
  private RedirectType redirectType;

  private String shortUrl;

  public URL(URLRequest urlRequest) {
    this.value = urlRequest.getUrl();
    this.redirectType = RedirectType.getByValue(urlRequest.getRedirectType());
    this.shortUrl = URLGenerator.generateShortURL();
  }
}
