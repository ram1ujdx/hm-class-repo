package com.hm.airlines.airlinesinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.airlinesinfo.model.Flight;
import com.hm.airlines.airlinesinfo.service.FlightInfoService;

@RestController
@RequestMapping("/flights")
public class FlightInfoController {
	
	@Autowired
	private FlightInfoService service;

	@GetMapping("/{flightNo}")
	
	public Flight getFlightDetails(@PathVariable String flightNo) {
		
		return service.getFlightInfo(flightNo);
	}
	
}
