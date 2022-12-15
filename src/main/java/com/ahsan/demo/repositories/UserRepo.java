package com.ahsan.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahsan.demo.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	public Optional<User> findUserByUsername(String username);
}
