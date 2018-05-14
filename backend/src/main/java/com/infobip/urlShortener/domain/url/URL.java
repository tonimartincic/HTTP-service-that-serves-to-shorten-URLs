package com.infobip.urlShortener.domain.url;

import com.infobip.urlShortener.enumeration.RedirectType;
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

  public URL(URLRequest urlRequest) {
    this.value = urlRequest.getUrl();
    this.redirectType = RedirectType.getByValue(urlRequest.getRedirectType());
  }
}
