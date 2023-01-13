package com.hm.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hm.employeeapp.exception.EmployeeNotFoundException;
import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
		
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return repo.findById(employeeId)
					.orElseThrow(()->new EmployeeNotFoundException("Employee with ID "+employeeId+" Not Found"));
	}

	@Override
	public void deleteEmployee(int employeeId) {
		if(!repo.existsById(employeeId)) {
			throw new EmployeeNotFoundException("Employee with ID "+employeeId+" Not Found");
		}
		repo.deleteById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if(!repo.existsById(employee.getEmployeeId())) {
			throw new EmployeeNotFoundException("Employee with ID "+employee.getEmployeeId()+" Not Found");
		}
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		return repo.findByEmployeeName(employeeName);
	}
	
	@Override
	public Employee getEmployeeByEmail(String email) {
		return repo.findByEmail(email);
	}

	
	
}
