package com.ahsan.demo.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

import com.ahsan.demo.security.MyUserDetailsService;

@Configuration
public class SecurityConfig {

	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
        	.authorizeHttpRequests((authz) -> authz
        			.antMatchers("/","/home","/login","/register").permitAll()
        			.anyRequest()
        		.authenticated()
        )
        	.userDetailsService(myUserDetailsService)
        .formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/");
		
		return http.build();	
	}
	
	
//	@Bean
//  public InMemoryUserDetailsManager userDetailsService() {
//		final Properties users = new Properties();
//      users.put("ahsan",passwordEncoder().encode("ahsan123")+",USER,enabled");
//      users.put("ali",passwordEncoder().encode("ali123")+",USER,enabled");
//		
//      return new InMemoryUserDetailsManager(users);
//    }
	
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	  return new BCryptPasswordEncoder(10);
	}
	
}
