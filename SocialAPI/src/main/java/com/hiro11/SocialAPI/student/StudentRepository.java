package com.hiro11.SocialAPI.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
	//With this the crud methods are now available
}
