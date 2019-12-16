package com.controle.financeiro.controle.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
 
	@Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http
	        .csrf().disable()
	        .authorizeRequests()
	        .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
	        .antMatchers(HttpMethod.POST, "/login", "/register").permitAll()
	        .antMatchers("/api/**").authenticated()     
	        .anyRequest().authenticated()
		        .and()
	        	.httpBasic().authenticationEntryPoint(authenticationEntryPoint)
	        	.and()
	        	.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
    
    @Override
    public void configure(AuthenticationManagerBuilder builder) throws Exception {
      builder.userDetailsService(new UserDetailsServiceImpl());
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
    }
    
    

}
