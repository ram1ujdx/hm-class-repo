package com.hm.airlines.airlinescoupons.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

	private String couponCode;
	private double discount;
	private LocalDate validTill;
	
}
