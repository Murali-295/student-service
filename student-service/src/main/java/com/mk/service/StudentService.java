package com.mk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.entity.Student;
import com.mk.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public Student findStudentById(Integer studentId) {
		Optional<Student> optional = repository.findById(studentId);
		if (optional.isEmpty()) {
			return null;
		}
		Student student = optional.get();
		return student;
	}

	public Student deleteStudent(Integer studentId) {
		Optional<Student> optional = repository.findById(studentId);
		if (optional.isEmpty()) {
			return null;
		}

		repository.deleteById(studentId);
		Student student = optional.get();
		return student;
	}

}
