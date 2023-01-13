package com.hm.employeeapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hm.employeeapp.model.Employee;

@Repository("collectionDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	Map<Integer,Employee> employeeDb = new HashMap<>();

	
	public void saveEmployee(Employee emp) {
		employeeDb.put(emp.getEmployeeId(), emp);
	}

	public Employee getEmployeeById(int employeeId) {
		return employeeDb.get(employeeId);
	}

	public void deleteEmployee(int employeeId) {
			employeeDb.remove(employeeId);
	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employeeDb.values());
	}

	
}
