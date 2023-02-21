package com.springapi.userTodo.repository;

import com.springapi.userTodo.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRespository extends MongoRepository<Todo, String> {

    @Query("{'name':?0}")
    Optional<Todo> findbyName(String name);
}
