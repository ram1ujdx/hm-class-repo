package com.hm.employeeapp.service;

import java.util.List;

import com.hm.employeeapp.exception.EmployeeNotFoundException;
import com.hm.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(int employeeId) throws EmployeeNotFoundException;

	public void deleteEmployee(int employeeId) throws EmployeeNotFoundException;

	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeByName(String employeeName) throws EmployeeNotFoundException;
	
	public Employee getEmployeeByEmail(String email) throws EmployeeNotFoundException;

}
