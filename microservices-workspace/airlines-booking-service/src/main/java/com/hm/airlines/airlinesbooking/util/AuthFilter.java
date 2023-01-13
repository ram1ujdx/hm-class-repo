package com.hm.airlines.airlinesbooking.util;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerExceptionResolver;

import com.hm.airlines.airlinesbooking.exception.UnauthorizedUserException;
@Component
public class AuthFilter implements Filter {
	
	@Autowired
	RestTemplate rt;
	
	@Autowired
	@Qualifier("handlerExceptionResolver")
	HandlerExceptionResolver resolver;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		
		String header = httpServletRequest.getHeader("auth");
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		headers.set("auth", header);
		HttpEntity<String> httpEntity = new HttpEntity<>(null,headers);
		try {
		rt.exchange("http://airlines-auth-service/auth/user", HttpMethod.GET, httpEntity, String.class);
		chain.doFilter(request, response);
		}
		catch (RestClientException ex) {
			resolver.resolveException(httpServletRequest,httpServletResponse , null, 
					new UnauthorizedUserException("User Must be Logged In")
					);
		}
		
		
		
	}
	
}
