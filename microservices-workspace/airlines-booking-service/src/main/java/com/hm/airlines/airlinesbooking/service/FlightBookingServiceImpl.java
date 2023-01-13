package com.hm.airlines.airlinesbooking.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hm.airlines.airlinesbooking.model.BookingDetails;
import com.hm.airlines.airlinesbooking.model.Coupon;
import com.hm.airlines.airlinesbooking.model.Flight;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private RestTemplate rt;
	
	@Override
	public BookingDetails getBookingDetails(String flightNo, String couponCode) {
		
		Flight flightDetails = getFlightDetails(flightNo);
		Coupon couponDetails = getCouponDetails(couponCode);
		
		double fare = flightDetails.getFare();
		
		double discount = couponDetails.getDiscount();
		
		if(couponDetails.getValidTill().isAfter(LocalDate.now())) {
			discount = fare *(discount/100);
			fare-=discount;
		}
		
		BookingDetails bookingDetails = new BookingDetails(flightDetails, couponDetails, fare);
		return bookingDetails;
		
	}
	
	
	private Flight getFlightDetails(String flightNo) {
		
	Flight flight =	rt.getForObject("http://AIRLINES-INFO-SERVICE/flights/"+flightNo,Flight.class);
	return flight;
		
	}
	
	
	
	private Coupon getCouponDetails(String couponCode) {
		Coupon coupon = rt.getForObject("http://AIRLINES-COUPON-DISCOUNTS-SERVICE/coupons/"+couponCode, Coupon.class);
		return coupon;
	}
	
	
}
