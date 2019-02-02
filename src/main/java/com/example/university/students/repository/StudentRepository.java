package com.example.university.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.university.students.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByStudentNo(String id);
	
}
