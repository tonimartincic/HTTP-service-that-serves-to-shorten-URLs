package com.infobip.urlShortener.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.infobip.urlShortener.domain.url.URL;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Account {

  public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;

  private String password;

  @JsonIgnore
  @OneToMany(mappedBy = "account")
  private Set<URL> urls;

  public Account() {
  }

  public Account(String username, String password) {
      this.username = username;
      this.setPassword(password);
  }

  public void setPassword(String password) {
    this.password = PASSWORD_ENCODER.encode(password);
  }

  @Override
  public String toString() {
    return "Account{" +
      "username='" + username + '\'' +
      '}';
  }
}
