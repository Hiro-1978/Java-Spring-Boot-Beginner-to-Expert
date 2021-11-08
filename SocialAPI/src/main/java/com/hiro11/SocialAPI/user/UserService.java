package com.hiro11.SocialAPI.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hiro11.SocialAPI.location.Location;

@Service
public class UserService {
	User user1 = new User( //ย้ายมาจาก UserController เพื่อให้เป็นการใช้งานจากทาง Service แทน
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"Jany@gmail.com");
			
		   User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
					"Jadon@gmail.com");
			
		   private List<User> users = Arrays.asList(user1, user2);	
			
		   public List<User> getAllUsers() {
			return users;
		   }
}
