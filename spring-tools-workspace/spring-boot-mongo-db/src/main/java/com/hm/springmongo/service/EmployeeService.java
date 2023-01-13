package com.hm.springmongo.service;

import java.util.List;

import com.hm.springmongo.model.Employee;



public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(long employeeId);

	public void deleteEmployee(long employeeId);

	public Employee updateEmployee(Employee employee);

	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByName(String employeeName) ;
	
	public Employee getEmployeeByEmail(String email) ;

}
