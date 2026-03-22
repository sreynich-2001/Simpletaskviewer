package com.example.simpletaskviewer.controller;

import com.example.simpletaskviewer.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
    
	//一覧表示
	@GetMapping("/tasks")
	public String showTasks(Model model) {
		model.addAttribute("tasks", taskService.getAllTasks());
		return "task-list";
	}

	//追加
	@PostMapping("/tasks/add")
	public String addTask(@RequestParam String title) {
		taskService.addTask(title);
		return "redirect:/tasks";
	}

	//削除
	@PostMapping("/tasks/delete")
    public String deleteTask(@RequestParam int id) {
		taskService.deleteTask(id);		
		return "redirect:/tasks";
	}
}
//URL:http://localhost:8080/tasks