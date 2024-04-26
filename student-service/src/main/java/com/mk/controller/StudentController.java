package com.mk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.entity.Student;
import com.mk.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("/id{id}")
	public Student findStudentById(@PathVariable("id") Integer studentId) {
		return service.findStudentById(studentId);
	}

	@DeleteMapping("/delete{id}")
	public Student deleteStudent(@PathVariable("id") Integer studentId) {
		return service.deleteStudent(studentId);
	}
	
}
