package com.hm.airlines.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.authservice.dto.JwtToken;
import com.hm.airlines.authservice.dto.UserCredentials;
import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.service.UserAuthService;
import com.hm.airlines.authservice.service.UserService;


@RestController
@RequestMapping("/auth/public")
public class UserAuthenticationController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private UserAuthService authService;
	

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("/login")
	public JwtToken login(@RequestBody UserCredentials credentials) {
		return authService.validateCredentials(credentials);
	}
	
}
