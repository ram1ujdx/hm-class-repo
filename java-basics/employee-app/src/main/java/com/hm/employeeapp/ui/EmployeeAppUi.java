package com.hm.employeeapp.ui;

import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hm.employeeapp.exception.EmployeeNotFoundException;
import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.service.EmployeeService;
import com.hm.employeeapp.service.EmployeeServiceImpl;

@Component
public class EmployeeAppUi {

	Scanner scan = new Scanner(System.in);
	
	@Autowired
	private EmployeeService service;

	public void launchMenu() {
		int choice = 0;
		do {
			System.out.println("Hello World");
			System.out.println("Choose an option : ");
			System.out.println("1 - Add New Employee");
			System.out.println("2 - Search Employee");
			System.out.println("3 - Delete Employee");
			System.out.println("4 - View All the Employees");
			System.out.println("5 - Search Employee by Name");
			System.out.println("0 - Exit");

			choice = scan.nextInt();
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				searchEmployee();
				break;
				
			case 4:
				printAllEmployee();
				break;
			}
		} while (choice != 0);

		System.out.println("Bye....");
	}

	public void addEmployee() {
		System.out.println("Enter employee details : ");
		System.out.print("ID : ");
		int id = scan.nextInt();
		System.out.print("Name : ");
		String name = scan.next() + scan.nextLine();
		System.out.print("Salary : ");
		float salary = scan.nextFloat();
		Employee emp = new Employee(id, name, salary);
		try {
			service.addEmplopyee(emp);
			System.out.println("Employee Added");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

	public void printAllEmployee() {
		List<Employee> employees;
		try {
			employees = service.getAllEmployee();
			for (Employee emp : employees) {
				System.out.println(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
	
	public void searchEmployee() {
		System.out.println("Enter Employee ID :");
		int id = scan.nextInt();
		Employee emp;
		try {
			emp = service.serachEmployee(id);
			System.out.println(emp);
			
			
		} 
		catch(EmployeeNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
