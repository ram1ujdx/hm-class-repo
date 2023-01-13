package com.hm.employeeapp.service;

import java.sql.SQLException;
import java.util.List;

import com.hm.employeeapp.dao.EmployeeDao;
import com.hm.employeeapp.dao.EmployeeDaoImpl;
import com.hm.employeeapp.dao.EmployeeDaoJdbcImpl;

import com.hm.employeeapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao dao = new EmployeeDaoJdbcImpl();

	@Override
	public Employee serachEmployee(int employeeId) throws SQLException{
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public void addEmplopyee(Employee employee) throws SQLException {
		 dao.saveEmployee(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		dao.deleteEmployee(employeeId);

	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		return dao.getAllEmployees();
	}

}
