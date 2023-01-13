package com.hm.streamapi;

import java.util.Arrays;
import java.util.List;

public class EmployeeServiceImpl {

	public static void main(String[] args) {
		
		Department d1 = new Department(501, "IT", "Bangalore");
		Department d2 = new Department(502,"Sales","Delhi");
		
		
		Employee e1 = new Employee(1001, "Javed", 52000, d1);
		Employee e2 = new Employee(1005, "Suraj", 22000, d2);
		Employee e3 = new Employee(1002, "Rohit", 32500, d1);
		Employee e4 = new Employee(2005, "Harsh", 72000, d2);
		Employee e5 = new Employee(3002, "Shreya", 24000, d1);
		Employee e6 = new Employee(1001, "Kunal", 21500, d1);
		
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		// List all the employees having salary>25000 in increasing order
		
//		List<Employee> empsWithGoodSalary = 
				
				
				
			Employee employee =	empList.stream()
											.filter(e->e.getSalary()>75000)
											.sorted((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary()))
											.findFirst().get();
		
//		empsWithGoodSalary.forEach(System.out::println);
		
		// Find the highest paid employee
		
		Employee emp = empList.stream()
				.max((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary()))
				.get();
		
		System.out.println(emp);
		
		// Find the highest paid employee of a particular dept
		
		
				
		
		
		
	}
	
	
}
