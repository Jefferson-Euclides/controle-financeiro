package com.controle.financeiro.controle.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.User;

public class UserDetailsServiceImpl implements UserDetailsService{
	public UserDetails loadUserByUsername(String username) throws 
    UsernameNotFoundException {
      BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
      if(username.equals("adriana")) {
        return User.withUsername("adriana").password(encoder.encode("87433259"))
          .roles("USER").build();
      }
      else throw new UsernameNotFoundException("Usuário não encontrado"); 
  }
}
