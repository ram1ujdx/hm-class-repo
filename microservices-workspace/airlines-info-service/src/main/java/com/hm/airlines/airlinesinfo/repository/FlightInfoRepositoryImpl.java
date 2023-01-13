package com.hm.airlines.airlinesinfo.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.hm.airlines.airlinesinfo.model.Flight;

@Repository
public class FlightInfoRepositoryImpl implements FlightInfoRepository{

	Map<String, Flight> flightDb;
	
	@PostConstruct
	public void init() {
		flightDb = new HashMap<>();
		flightDb.put("f1020", new Flight("f1020", "Indigo Airlines", 7000.0, "Bangalore", "Delhi"));
		flightDb.put("f2080", new Flight("f2080", "SpiceJet", 8500.0, "Bangalore", "Delhi"));
		flightDb.put("f5090", new Flight("f5090", "Indigo Airlines", 7500.0, "Bangalore", "Lucknow"));
		
		
	}
	
	
	@Override
	public Flight getFlightInfo(String flightNo) {
		return flightDb.get(flightNo);
	}
	
}
