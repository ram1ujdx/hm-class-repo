package com.hm.employeeapp.repository;

import java.util.List;

import com.hm.employeeapp.model.Employee;

public interface EmployeeRepository {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(int employeeId);
	
	public void deleteEmployee(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByName(String employeeName);
	
}
