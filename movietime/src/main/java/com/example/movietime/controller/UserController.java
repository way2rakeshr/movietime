package com.example.movietime.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movietime.dto.UserResponse;
import com.example.movietime.entity.User;

@RestController("/user")
public class UserController {
	
	
	@PostMapping
	public ResponseEntity<UserResponse> saveUser(@Valid @RequestBody User user) {
		return null;
		
	}

}
