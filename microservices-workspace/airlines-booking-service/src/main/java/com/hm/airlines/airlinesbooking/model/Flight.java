package com.hm.airlines.airlinesbooking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

	private String flightNo;
	private String airlineName;
	private double fare;
	private String source;
	private String dstn;
	
	
}
