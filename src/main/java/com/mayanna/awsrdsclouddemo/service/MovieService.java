package com.mayanna.awsrdsclouddemo.service;

import com.mayanna.awsrdsclouddemo.model.Movie;
import com.mayanna.awsrdsclouddemo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class MovieService {

    UsersRepository usersRepository;

    @Autowired
    public MovieService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Transactional(readOnly = true)
    public List<Movie> getAllMovies() {
        return usersRepository.findAll();
    }

    public List<Movie> insertMovies(@RequestBody final List<Movie> movieList) {
        usersRepository.saveAll(movieList);
        return usersRepository.findAll();
    }

}
