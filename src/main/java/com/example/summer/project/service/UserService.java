package com.example.summer.project.service;

import com.example.summer.project.models.User;
import com.example.summer.project.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public User createUser(User user){
        return usersRepository.save(user);
    }


    public Optional<User> findOne(String id){
        return Optional.of(usersRepository.findById(id).get());
    }

    public List<User> findAll(){
        return usersRepository.findAll();
    }
}
