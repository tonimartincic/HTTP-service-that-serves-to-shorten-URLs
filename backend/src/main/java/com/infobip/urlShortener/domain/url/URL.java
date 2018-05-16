package com.infobip.urlShortener.domain.url;

import com.infobip.urlShortener.domain.account.Account;
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

  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;

  @Column(length = 1024)
  private String value;

  @Enumerated(EnumType.STRING)
  private RedirectType redirectType;

  private String shortUrl;

  private Long numberOfRedirects;

  public URL() {
  }

  public URL(URLRequest urlRequest) {
    this.value = urlRequest.getUrl();
    this.redirectType = RedirectType.getByValue(urlRequest.getRedirectType());
    this.numberOfRedirects = 0L;
  }

  @Override
  public String toString() {
    return "URL{" +
      "account=" + account +
      ", value='" + value + '\'' +
      ", shortUrl='" + shortUrl + '\'' +
      '}';
  }
}
