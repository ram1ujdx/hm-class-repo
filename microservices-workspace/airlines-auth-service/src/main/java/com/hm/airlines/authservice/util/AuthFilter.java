package com.hm.airlines.authservice.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.airlines.authservice.exception.InvalidCredentialsException;
import com.hm.airlines.authservice.exception.UnauthorizedUserException;
import com.hm.airlines.authservice.model.User;
import com.hm.airlines.authservice.model.UserType;
import com.hm.airlines.authservice.service.UserService;

@Component
public class AuthFilter implements Filter {
	
	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserService service;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Filter Intercepted the Request");
		HttpServletRequest httpRequest=(HttpServletRequest) request;
		
		String uri = httpRequest.getRequestURI();
		
		if(uri.startsWith("/auth/public")) {
			chain.doFilter(httpRequest, response);
			return;
		}
		
		
		String header = httpRequest.getHeader("auth");
		if(header==null || header.isEmpty()) {
			System.err.println("Token Not Present");
			throw new InvalidCredentialsException("Invalid Token/Credentials");
		}
		
		String username = util.decodeJwt(header);
		User user = service.getUserByUsername(username);
		System.out.println(user);
		if(user==null) {
			throw new InvalidCredentialsException("Invalid Token/Credentials");
		}
		
		if(uri.startsWith("/auth/user")){
			if(user.getRole()==UserType.USER) {
					chain.doFilter(request, response);
					return;
			}
			else {
				throw new UnauthorizedUserException("Forbidden");
			}
		}
		
		else if(uri.startsWith("/auth/admin")){
			if(user.getRole()==UserType.ADMIN) {
					chain.doFilter(request, response);
					return;
			}
			else {
				throw new UnauthorizedUserException("Forbidden");
			}
		}
		
		
	
		
	}
	
}
