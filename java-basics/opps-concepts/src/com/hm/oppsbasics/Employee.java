package com.hm.oppsbasics;

public class Employee extends Person {
	
	int employeeId;
	float salary;
	
	public Employee() {

	}
	 
	
	
	public Employee(String personName, String email, int age, 
						int employeeId, float salary) {
		super(personName, email, age);
		this.employeeId = employeeId;
		this.salary = salary;
		
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Employee id : "+employeeId);
		System.out.println("Salary : "+salary);
		
	}
	

}
