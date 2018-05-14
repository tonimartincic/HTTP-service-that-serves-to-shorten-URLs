//package com.infobip.urlShortener.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//  private CustomAuthenticationProvider authenticationProvider;
//
//  @Autowired
//  public SecurityConfiguration(CustomAuthenticationProvider authenticationProvider) {
//    this.authenticationProvider = authenticationProvider;
//  }
//
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.authenticationProvider(this.authenticationProvider);
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//      .authorizeRequests()
//      .antMatchers("/favicon.ico", "/", "/api/account/validate", "/api/account").permitAll()
//      .anyRequest().authenticated()
//      .and()
//      .formLogin()
//      .usernameParameter("username")
//      .passwordParameter("password")
//      .loginPage("/")
//      .loginProcessingUrl("/api/account/validate")
//      .and()
//      .httpBasic()
//      .and()
//      .csrf().disable()
//      .logout()
//      .logoutSuccessUrl("/");
//  }
//}
