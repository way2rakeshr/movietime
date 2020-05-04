package com.example.movietime.service;


import com.example.movietime.dto.UserResponse;
import com.example.movietime.entity.User;

public interface UserService {

	UserResponse saveUser( User user);
}
