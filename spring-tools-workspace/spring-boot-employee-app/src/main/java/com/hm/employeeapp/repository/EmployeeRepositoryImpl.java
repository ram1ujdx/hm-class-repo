package com.hm.employeeapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.hm.employeeapp.model.Employee;

//@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository, InitializingBean{

	Map<Integer, Employee> employeeDb= new HashMap<>();
	
	@Override
	public void afterPropertiesSet() throws Exception {
		Employee e1 = new Employee(1001,"Karan","karan@yahoo.com");
		Employee e2 = new Employee(1002,"Harish","harish@yahoo.com");
		Employee e3 = new Employee(1003,"Gaurav","gaurav@yahoo.com");
		
		employeeDb.put(e1.getEmployeeId(), e1);
		employeeDb.put(e2.getEmployeeId(), e2);
		employeeDb.put(e3.getEmployeeId(), e3);
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDb.get(employeeId);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeDb.remove(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDb.put(employee.getEmployeeId(), employee);
		return employee;	
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employeeDb.values());
	}
	
	@Override
	public Employee getEmployeeByName(String employeeName) {
		
		return employeeDb.values().stream()
				.filter(e->e.getEmployeeName().equalsIgnoreCase(employeeName))
				.findFirst().get();
		
	}

	
	
}
