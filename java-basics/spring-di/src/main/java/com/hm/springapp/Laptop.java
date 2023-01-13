package com.hm.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Laptop {
	public Laptop() {
		System.out.println("Laptop Bean Created..");
	}
	

	@Autowired
	private InternetConnection connection;
	

	public InternetConnection getConnection() {
		return connection;
	}
	
	
	
	public Laptop(InternetConnection connection) {
		this.connection = connection;
	}


	public void browseInternet() {
		connection.checkConnection();
		connection.browse();
	}
	
	public void sendMail() {
		connection.sendMail();
	}
	
	
}
