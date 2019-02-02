package com.example.university.students.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "id_student")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idStudent;

	@Column(name = "student_no")
	String studentNo;

	@Column
	String surname;

	@Column
	String forename;

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", surname=" + surname + ", forename=" + forename + "]";
	}

}
