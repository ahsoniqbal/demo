package com.ahsan.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ahsan.demo.models.Question;

public interface QuestionRepo extends CrudRepository<Question, Long>{
	 public List<Question> findAll();
	
}
