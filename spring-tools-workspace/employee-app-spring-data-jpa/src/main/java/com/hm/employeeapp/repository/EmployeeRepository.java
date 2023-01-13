package com.hm.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hm.employeeapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("from Employee where employeeName=:employeeName")
	public Employee findByEmployeeName(String employeeName);
	
	public Employee findByEmail(String email);
	
}
