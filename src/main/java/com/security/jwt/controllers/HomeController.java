package com.security.jwt.controllers;

import com.security.jwt.models.User;
import com.security.jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.*;

@RestController
@RequestMapping("/admin")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser()
	{
		System.out.println("getting users");
		List<User> users = this.userService.getAllUsers();
		return users;
	}

	@GetMapping("/current-user")
	public String getCurrentUser(Principal principal)
	{
		return principal.getName();
	}
}
