package com.devjava.com.devjava.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devjava.com.devjava.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
