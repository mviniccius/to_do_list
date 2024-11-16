package com.mviniccius.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mviniccius.todolist.domain.Todo;

@Repository
public interface ToDoRepository extends JpaRepository<Todo, Integer>{
 
}
