package com.hm.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return repo.addEmployee(employee);
	}

	@Override
	public Employee getEmployee(int employeeId) {
			return repo.getEmployee(employeeId);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		repo.deleteEmployee(employeeId);

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.getAllEmployees();
	}
	
	@Override
	public Employee getEmployeeByName(String employeeName) {
		return repo.getEmployeeByName(employeeName);
		}

}
