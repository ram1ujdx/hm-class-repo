package com.hm.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.hm.employeeapp.model.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee emp) throws SQLException;
	
	public Employee getEmployeeById(int employeeId) throws SQLException;
	
	public void deleteEmployee(int employeeId);
	
	public List<Employee> getAllEmployees() throws SQLException;
	
	
}
