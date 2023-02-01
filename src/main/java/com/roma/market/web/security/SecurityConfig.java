package com.roma.market.web.security;

import com.roma.market.domain.service.RomaUserDetailsService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig  {
    //extends WebSecurityConfigurerAdapter
    //private RomaUserDetailsService romaUserDetailsService;
    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      //  auth.userDetailsService(romaUserDetailsService);
    //}
}
