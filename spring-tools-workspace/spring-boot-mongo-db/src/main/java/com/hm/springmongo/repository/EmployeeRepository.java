package com.hm.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hm.springmongo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	public Employee findByEmployeeName(String employeeName);
	
	public Employee findByEmail(String email);
	
	
}
