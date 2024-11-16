package com.mviniccius.todolist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mviniccius.todolist.domain.Todo;
import com.mviniccius.todolist.repositories.ToDoRepository;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {
	
	@Autowired
	private ToDoRepository todoRepoitory;

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formartter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo(1, "teste", "testando",LocalDateTime.parse("25/03/2025 11:00", formartter) , false);
		
		todoRepoitory.saveAll(Arrays.asList(t1));
	}

}
