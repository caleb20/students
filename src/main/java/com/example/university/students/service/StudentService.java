package com.example.university.students.service;

import java.util.List;

import com.example.university.students.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	
	Student registrarAlumno(Student alumno);
	
	Student getStudentbyNo(String no);

}
