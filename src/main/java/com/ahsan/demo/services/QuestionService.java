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
		return (List<Question>)questionRepo.findAll();
	}
	
	
	public Optional<Question> getQuestion(Integer id) throws IllegalArgumentException{
		return questionRepo.findById(id);
	}
	
	public Question addQuestion(Question ques) throws IllegalArgumentException{
		if(ques!=null) {
			return questionRepo.save(ques);
		}
		throw new IllegalArgumentException("Question cannot be null");
	}
	
	
}
