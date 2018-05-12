package com.infobip.urlShortener.service.impl;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SpringDataJpaUserDetailsService implements UserDetailsService {

  private final AccountRepository accountRepository;

  @Autowired
  public SpringDataJpaUserDetailsService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
    Optional<Account> account = this.accountRepository.findById(name);

    if(!account.isPresent()) {
      throw new UsernameNotFoundException("Username not found");
    }

    return new User(account.get().getId(), account.get().getPassword(), AuthorityUtils.NO_AUTHORITIES);
  }
}
