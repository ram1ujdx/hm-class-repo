package com.hm.employeeapp.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hm.employeeapp.dto.ErrorResponse;
import com.hm.employeeapp.exception.EmployeeNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class EmployeeErrorController {

	
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	public ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(Exception ex, HttpServletRequest request) {
		
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		LocalDateTime timestamp = LocalDateTime.now();
		int status = httpStatus.value();
		String error = httpStatus.getReasonPhrase();
		String message = ex.getMessage();
		String path = request.getRequestURI();
		
		ErrorResponse body = new ErrorResponse(timestamp, status, error, message, path);
		
		return ResponseEntity.status(httpStatus).body(body);
		
	}
	
	
	
}
