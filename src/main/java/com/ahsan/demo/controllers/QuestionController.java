package com.ahsan.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ahsan.demo.services.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
}
