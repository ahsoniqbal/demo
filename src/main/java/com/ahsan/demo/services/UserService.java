package com.ahsan.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ahsan.demo.config.PasswordEnocde;
import com.ahsan.demo.models.User;
import com.ahsan.demo.repositories.UserRepo;

@Service
public class UserService {

	
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
//	public UserService() {
//		users.add(new User(101, "ahsan", "ahsan@gmail.com", "ahsan123"));
//		users.add(new User(102, "ali", "ali@yahoo.com", "ali123"));
//	}
	
	public List<User> getAll(){
		return userRepo.findAll();
	}
	
//	public User getUser(String username) {
//		return users.stream()
//				.filter(u -> u.getUsername().equalsIgnoreCase(username)).findAny().orElse(null);
//	}
	
	public User getUserById(Integer id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public User addUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepo.save(user);
	}
	
}
