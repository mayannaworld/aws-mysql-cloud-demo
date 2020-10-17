package com.mayanna.awsrdsclouddemo.repository;


import com.mayanna.awsrdsclouddemo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Movie, Integer> {
}
