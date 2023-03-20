package com.ahsan.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ahsan.demo.models.Question;
import com.ahsan.demo.services.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping("/questions")
	public String getAll(Model model) {
		model.addAttribute("questions", questionService.getAllQuestion());
		return "questions/index";
	}
	
	@GetMapping("/questions/ask")
	public String ask() {
		return "questions/ask";
	}
	
}
