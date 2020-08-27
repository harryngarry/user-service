package com.iboss.us.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iboss.us.Entity.User;
import com.iboss.us.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/newUser")
	public User createUser(@RequestBody User user) throws JsonProcessingException {
		return userService.createUser(user);
	}

	@GetMapping("getUser/{userId}")
	public User findUserDetailsByUserId(@PathVariable int userId) throws JsonProcessingException {
		return userService.findUserDetailsByUserId(userId);
	}

}
