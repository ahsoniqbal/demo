package com.ahsan.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ahsan.demo.models.Poll;

public interface PollRepo extends CrudRepository<Poll, Integer>{
	
	
}
