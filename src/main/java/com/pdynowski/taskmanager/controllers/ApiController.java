package com.pdynowski.taskmanager.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdynowski.taskmanager.entities.Task;
import com.pdynowski.taskmanager.repositories.TaskRepository;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	private final TaskRepository taskRepository;
	
	public ApiController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@GetMapping("/index")
	public String index() {
		return "hello punk";
	}
	
	@GetMapping("/tasks")
	@CrossOrigin(origins = "http://localhost:3000")
	public Iterable<Task> findAllTasks() {
		return this.taskRepository.findAll();
	}
}
