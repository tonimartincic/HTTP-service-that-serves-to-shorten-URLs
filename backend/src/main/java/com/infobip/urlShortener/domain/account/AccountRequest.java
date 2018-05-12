package com.infobip.urlShortener.domain.account;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;

@ToString(exclude = "password")
@Data
public class AccountRequest {

  @Id
  private String id;

  private String password;

  public AccountRequest() {
  }

  public AccountRequest(String id, String password) {
    this.id = id;
    this.password = password;
  }
}
