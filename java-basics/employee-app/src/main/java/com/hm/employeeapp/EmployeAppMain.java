package com.hm.employeeapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hm.employeeapp.config.AppConfig;
import com.hm.employeeapp.ui.EmployeeAppUi;

public class EmployeAppMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeAppUi app = context.getBean(EmployeeAppUi.class);
		
		app.launchMenu();
	}
}
