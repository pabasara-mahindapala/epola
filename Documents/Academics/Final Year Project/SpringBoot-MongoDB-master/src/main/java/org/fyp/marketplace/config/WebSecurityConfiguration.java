package org.fyp.marketplace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/").permitAll()
				.antMatchers(HttpMethod.POST, "/rest/account/add").permitAll()
				.antMatchers(HttpMethod.PUT, "/rest/account/update").permitAll()
				.antMatchers(HttpMethod.DELETE, "/rest/account/delete/*").permitAll()
				.antMatchers(HttpMethod.GET, "/rest/account/all").permitAll().anyRequest().authenticated();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
