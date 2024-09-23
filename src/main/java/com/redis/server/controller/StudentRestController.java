package com.redis.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.redis.server.entity.Student;
import com.redis.server.repository.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		repository.save(student);
		return "Student Added";
	}
	
	@GetMapping("/allStudent")
	public Iterable<Student> getAllStudents(){
		return repository.findAll();
	}
}
