package com.ahsan.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping("/")
	public String loadHome() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login/index";
	}
	
}
	