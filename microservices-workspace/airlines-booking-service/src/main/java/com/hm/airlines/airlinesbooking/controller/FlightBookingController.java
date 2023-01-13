package com.hm.airlines.airlinesbooking.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.airlinesbooking.model.BookingDetails;
import com.hm.airlines.airlinesbooking.model.Coupon;
import com.hm.airlines.airlinesbooking.model.Flight;
import com.hm.airlines.airlinesbooking.service.FlightBookingService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/bookings")
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService service;

	@GetMapping("/flight/{flightNo}/coupon/{code}")
	//@CircuitBreaker(fallbackMethod = "getBookingDetailsFallback", name = "airlines-service-cb")
	public BookingDetails getBookingDetails(@PathVariable String flightNo,
						@PathVariable String code) {
		
		return service.getBookingDetails(flightNo, code);
		
	}
	
	public BookingDetails getBookingDetailsFallback(@PathVariable String flightNo,
			@PathVariable String code, Exception ex) {
		System.err.println(ex);
		return new BookingDetails(new Flight(flightNo, "ABC", 0, "A", "B"), 
									new Coupon(code,0,LocalDate.now()), 0);
			
		}
	
	@GetMapping("/flight/{flightNo}")
	public BookingDetails getBookingDetails(@PathVariable String flightNo) {
		
		return null;
		
	}
	
}
