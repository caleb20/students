package com.example.university.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.university.students.entity.Student;
import com.example.university.students.service.StudentService;

@RestController
@RequestMapping("estudiantes")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/lista")
	public List<Student> getListStudents() {

		return studentService.getAllStudent();

	}
	
	@GetMapping("/id/{id}")
	public Student getStudents(@PathVariable String id) {

		return studentService.getStudentbyNo(id);

	}
	
	@PostMapping("/insertar")
	public Student registrarAlumno(@RequestBody Student alumno) {
		return studentService.registrarAlumno(alumno);
	}
}
