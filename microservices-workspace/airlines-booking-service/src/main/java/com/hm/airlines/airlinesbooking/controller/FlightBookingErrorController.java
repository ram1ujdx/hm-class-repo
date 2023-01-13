package com.hm.airlines.airlinesbooking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hm.airlines.airlinesbooking.exception.UnauthorizedUserException;

@RestControllerAdvice
public class FlightBookingErrorController {

	@ExceptionHandler(UnauthorizedUserException.class)
	public ResponseEntity<String> handleUnauthorizedAccessError(Exception ex){
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
		
	}
	
}
