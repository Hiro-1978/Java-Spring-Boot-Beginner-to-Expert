package com.hiro11.SocialAPI.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public interface StudentRepository extends CrudRepository<Student, String> {
	// With this the crud methods are now available

	@RestController
	public class StudentController {

		@Autowired
		private StudentService studentService;

		@RequestMapping(value = "/students")
		public List<Student> getAllStudents() {
			return studentService.getAllStudents();
		}

		// Select
		@RequestMapping(value = "/students/{id}")
		public Optional<Student> getStudent(@PathVariable String id) {
			return studentService.getStudent(id);
		}

		// Insert into
		@RequestMapping(value = "/students", method = RequestMethod.POST)
		public void addStudent(@RequestBody Student student) {
			studentService.addStudent(student);
		}

		// Update
		@RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
		public void updateStudent(@RequestBody Student student, @PathVariable String id) {
			studentService.updateStudent(id, student);
		}

		// Delete
		@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
		public void deleteStudent(@PathVariable String id) {
			studentService.deleteStudent(id);

		}
	}
}