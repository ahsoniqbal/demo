package com.ahsan.demo.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ahsan.demo.models.User;
import com.ahsan.demo.repositories.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = this.userRepo.findUserByUsername(username);
		if(user.isEmpty()) throw new UsernameNotFoundException("User on given credentials not found!");
		
		return new MyUserDetails(user.get());
	}

}
