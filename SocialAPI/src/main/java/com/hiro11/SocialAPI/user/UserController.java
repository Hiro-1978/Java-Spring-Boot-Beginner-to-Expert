package com.hiro11.SocialAPI.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiro11.SocialAPI.location.Location;

@RestController
public class UserController {

	@Autowired // เรียกใช้งาน Service
	private UserService userService;

	@RequestMapping(value = "/users")
	public List<User> getAllUsers() {
		// ไปที่ UserService แทนแล้วเรียกใช้งานผ่าน UserService แทน
		/*
		 * User user1 = new User("u1", "Jany", "Lawrence", new Location("l1", "Lagos"),
		 * "Jany@gmail.com"); User user2 = new User("u2", "Jadon", "Mills", new
		 * Location("l2", "Asaba"), "Jadon@gmail.com"); return Arrays.asList(user1,
		 * user2);
		 */
		return userService.getAllUsers();
	}

	// Get Method -> select sql
	@RequestMapping(value = "/users/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}

	// Post Method - insert into sql
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	// Update Method -> update sql
	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public void getUser(@PathVariable String id, @RequestBody User user) {
		userService.updateUser(id, user);
	}

	// Delete Method - > delete sql
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}
