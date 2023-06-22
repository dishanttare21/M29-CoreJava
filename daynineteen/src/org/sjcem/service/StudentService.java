package org.sjcem.service;

import java.util.List;

import org.sjcem.entities.Student;

public interface StudentService {

	public boolean addStudent(Student student); //create
	public Student getStudent(int rollno); //retrieve with specific id
	public List<Student> getAll(); //retrieve all data
	public Student updateStudent(Student student); //update
	public boolean deleteStudent(int rollno); //delete
}
