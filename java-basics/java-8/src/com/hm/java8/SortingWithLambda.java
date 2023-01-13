package com.hm.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class EmployeeNameComparator implements Comparator<Employee>{
//	public int compare(Employee e1, Employee e2) {
//		return e1.getName().compareTo(e2.getName());
//	}
//}

public class SortingWithLambda {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,2,32,4,91,7,21);
//		Collections.sort(nums);
//		System.out.println(nums);
		
//		Comparator<Employee> compareByName 
//					= (e1,e2)-> e1.getName().compareTo(e2.getName());
		
		Employee emp1 = new Employee(1005, "Javed", 43500);
		Employee emp2 = new Employee(1004, "Mohit", 48500);
		Employee emp3 = new Employee(2001, "Kunal", 36500);
		Employee emp4 = new Employee(1002, "Suraj", 61500);
		
		List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4);
		Collections.sort(employeeList,(e1,e2)->e1.getId()-e2.getId());
		
//		for(Employee e:employeeList)
//			System.out.println(e);
		
		employeeList.forEach(e->System.out.println(e));
	
		// Method Reference
		nums.forEach(System.out::println);
		
		
		
	}
}
