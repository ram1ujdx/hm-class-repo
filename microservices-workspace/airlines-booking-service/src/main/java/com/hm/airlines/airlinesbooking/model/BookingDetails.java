package com.hm.airlines.airlinesbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetails {
	
	private Flight flightDetails;
	
	private Coupon couponDetails;
	
	private double finalFare;

}
