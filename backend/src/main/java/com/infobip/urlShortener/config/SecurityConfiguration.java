package com.infobip.urlShortener.config;

import com.infobip.urlShortener.domain.account.Account;
import com.infobip.urlShortener.service.impl.SpringDataJpaUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  private SpringDataJpaUserDetailsService userDetailsService;

  @Autowired
  public SecurityConfiguration(SpringDataJpaUserDetailsService userDetailsService) {
    this.userDetailsService = userDetailsService;
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth
      .userDetailsService(this.userDetailsService)
      .passwordEncoder(Account.PASSWORD_ENCODER);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
      .antMatchers("/favicon.ico", "/", "/account/**").permitAll()
      .anyRequest().authenticated()
      .and()
      .formLogin()
      .loginPage("/")
      .loginProcessingUrl("/")
      .permitAll()
      .and()
      .httpBasic()
      .and()
      .csrf().disable()
      .logout()
      .logoutSuccessUrl("/");
  }
}
