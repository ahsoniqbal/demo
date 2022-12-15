package com.ahsan.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahsan.demo.models.User;
import com.ahsan.demo.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id){
		User user = userService.getUserById(id);
		if(user != null)
			return new ResponseEntity<User>(user, HttpStatus.OK);
		
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
	
	
//	@RequestMapping("/{username}")
//	public ResponseEntity<User> getUser(@PathVariable String username){
//		User user = userService.getUser(username);
//		if(user != null)
//			return new ResponseEntity<User>(user, HttpStatus.OK);
//		
//		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//	}
	
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.OK);
	}
	
	
}
