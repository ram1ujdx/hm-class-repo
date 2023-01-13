package com.hm.airlines.authservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hm.airlines.authservice.dto.JwtToken;
import com.hm.airlines.authservice.dto.UserCredentials;
import com.hm.airlines.authservice.exception.InvalidCredentialsException;
import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.repository.UserRepository;
import com.hm.airlines.authservice.util.JwtUtil;

@Service
public class UserAuthService {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public JwtToken validateCredentials(UserCredentials credentials) {
		
		User user = repo.findUserByUsername(credentials.getUsername());
		if(!passwordEncoder.matches(credentials.getPassword(),user.getPassword())) {
			throw new InvalidCredentialsException("Incorrect Password");
		}
		
		String jwt = jwtUtil.generateJwt(user.getUsername());
		
		JwtToken jwtToken = new JwtToken(jwt);
		
		return jwtToken;
		
		
	}
	
	
	
	
}
