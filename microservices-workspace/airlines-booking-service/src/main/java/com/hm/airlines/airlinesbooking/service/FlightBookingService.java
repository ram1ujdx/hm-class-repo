package com.hm.airlines.airlinesbooking.service;

import com.hm.airlines.airlinesbooking.model.BookingDetails;

public interface FlightBookingService {

	public BookingDetails getBookingDetails(String flightNo, String couponCode);
	
}
