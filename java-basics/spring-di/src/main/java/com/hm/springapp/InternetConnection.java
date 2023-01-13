package com.hm.springapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InternetConnection {

	@Value("${connection-type}")
	String connectionType;
	
	
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public void checkConnection() {
		System.out.println("Current Connection : "+connectionType);
	}
	
	public void sendMail() {
		System.out.println("Mail Sent..");
	}
	
	public void browse() {
		System.out.println("Browsing Internet..");
	}
	
}
