package com.hiro11.SocialAPI.student;

import javax.persistence.Entity;
import javax.persistence.Id;

//Auto Create Table In Database
@Entity
public class Student {

	@Id
	private String id;
	private String name;
	private String department;
	
	public Student() {
	    //nothing goes here
	}
	
	public Student(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
