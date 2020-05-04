package com.example.movietime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movietime.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
