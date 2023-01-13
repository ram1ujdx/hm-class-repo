package com.hm.airlines.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User getUserByUsername(String username) {
		return repo.findUserByUsername(username);
	}
	
	@Override
	public User saveUser(User user) {
		
		String password = user.getPassword();
		String encodedPassword = passwordEncoder.encode(password);
		user.setPassword(encodedPassword);
		return repo.save(user);
	}
	
}
