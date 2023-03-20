package com.ahsan.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahsan.demo.models.Question;
import com.ahsan.demo.repositories.QuestionRepo;
import com.ahsan.demo.repositories.UserRepo;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepo questionRepo;
	
	public List<Question> getAllQuestion(){
		return questionRepo.findAll();
	}
}
