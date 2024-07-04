package com.example.summer.project.repository;

import com.example.summer.project.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {
}
