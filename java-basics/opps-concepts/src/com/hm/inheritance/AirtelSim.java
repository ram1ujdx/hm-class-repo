package com.hm.inheritance;

public class AirtelSim implements Sim {

	public void call() {
		System.out.println("Making a call using Airtel");
	}
	
	public void sendSms() {
		System.out.println("Sending SMS using Airtel");
	}
	
	
	@Override
	public void browseInternet() {
		
	}
	
	
}
