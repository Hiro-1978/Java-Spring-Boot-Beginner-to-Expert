package com.hiro11.SocialAPI.student;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, String> {
	// With this the crud methods are now available
	//this is a query method already implemented by JPA
	public Optional<Student> findById(String id);
	/*
	@Query("SELECT * FROM Student t where t.id = :id")
	public Optional<Student> findById(@Param("id")String id);
	
	@Query("SELECT * FROM Student t where t.id = ?1 AND t.department = ?2")
	public Optional<Student> findByNameAndDepartment(String name, String department);
	
	@Query("SELECT * FROM Student t where t.name = %?1%")
	public Optional<Student> findByCriteria(String criteria);
	*/
}
