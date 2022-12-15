package com.ahsan.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@GetMapping
	public ResponseEntity<String> getAll(){
		return ResponseEntity.ok("students data");
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getById(@PathVariable int id){
		return ResponseEntity.ok("students id"+id);
	}
	
}
