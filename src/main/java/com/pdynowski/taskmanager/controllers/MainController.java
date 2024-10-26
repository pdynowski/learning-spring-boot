package com.pdynowski.taskmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pdynowski.taskmanager.entities.Task;
import com.pdynowski.taskmanager.repositories.TaskRepository;

@Controller
public class MainController {
	
	private final TaskRepository taskRepository;
	
	public MainController(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/tasks")
	public String tasks(Model model) {
		model.addAttribute("tasks", this.taskRepository.findAll());
		return "tasks";
	}
}
