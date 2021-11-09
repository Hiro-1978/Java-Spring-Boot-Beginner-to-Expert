package com.hiro11.SocialAPI.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {	
	@Autowired
	public StudentRepository studentRepository;	
    // The Crud methods goes here
	
	//Get List of Students
	public List<Student> getAllStudents() {
		
	    List<Student> students = new ArrayList<>();
		
	    studentRepository.findAll()
	    .forEach(students::add);
		
	    return students;		
	}
	
	//Add a Student
	public void addStudent(Student student) {
	     studentRepository.save(student);
	}

	//Get Student by Id
	public Optional<Student> getStudent(String id) {
	     return studentRepository.findById(id);
	}

	//Update a Student
	public void updateStudent(String id, Student student) {
	     studentRepository.save(student);
	}
	
	//Delete a Student
	public void deleteStudent(String id) {
	     studentRepository.deleteById(id);
	}

}
