package com.hm.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Laptop laptop = (Laptop)context.getBean("laptop");
		

		
		
		laptop.browseInternet();
		laptop.sendMail();

	}

}
