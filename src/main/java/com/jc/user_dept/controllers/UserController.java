package com.jc.user_dept.controllers;

import java.net.ResponseCache;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.user_dept.entities.User;
import com.jc.user_dept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
}
