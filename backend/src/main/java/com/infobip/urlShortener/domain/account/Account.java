package com.infobip.urlShortener.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString(exclude = "password")
@Data
public class Account {

  public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

  @Id
  private String id;

  @JsonIgnore
  private String password;

  public Account() {
  }

  public Account(String id, String password) {
      this.id = id;
      this.setPassword(password);
  }

  public void setPassword(String password) {
    this.password = PASSWORD_ENCODER.encode(password);
  }
}
