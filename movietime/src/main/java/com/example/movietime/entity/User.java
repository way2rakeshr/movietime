package com.example.movietime.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Column(name = "email",nullable = false,unique = true)
	private  String email;
	@Column(name = "user_name",nullable = false)
	private String userName;
	@Column(name = "password",nullable = false)
	private String password;
	
}
