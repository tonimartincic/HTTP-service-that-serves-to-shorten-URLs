package com.infobip.urlShortener.domain.account;

import lombok.Data;
import lombok.ToString;

@Data
public class AccountRequest {

  private String username;

  private String password;

  public AccountRequest() {
  }

  public AccountRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public String toString() {
    return "AccountRequest{" +
      "username='" + username + '\'' +
      '}';
  }
}
