package com.example.university.students.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.university.students.entity.Student;
import com.example.university.students.repository.StudentRepository;
import com.example.university.students.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService{
	
	@Autowired
	StudentRepository student;

	@Override
	public List<Student> getAllStudent() {
		
		return student.findAll();
	}

	@Override
	public Student registrarAlumno(Student alumno) {
		
		return student.save(alumno);
	}

	@Override
	public Student getStudentbyNo(String no) {
		return student.findByStudentNo(no);
	}

}
