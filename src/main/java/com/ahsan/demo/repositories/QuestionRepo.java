package com.ahsan.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ahsan.demo.models.Question;

public interface QuestionRepo extends CrudRepository<Question, Integer>{

	
}
