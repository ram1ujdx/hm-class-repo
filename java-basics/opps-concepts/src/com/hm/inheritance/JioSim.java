package com.hm.inheritance;

public class JioSim implements Sim {

	public void call() {
		System.out.println("Making a call using JIO");
	}
	
	public void sendSms() {
		System.out.println("Sending SMS using JIO");
	}
	
	@Override
	public void browseInternet() {
		
	}
}
