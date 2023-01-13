package com.hm.employeeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.hm.employeeapp.model.Employee;

public interface EmployeeService {

	public Employee serachEmployee(int employeeId) throws SQLException ;
	
	public void addEmplopyee(Employee employee) throws SQLException;
	
	public void deleteEmployee(int employeeId);
	
	public List<Employee> getAllEmployee() throws SQLException;
	
}
