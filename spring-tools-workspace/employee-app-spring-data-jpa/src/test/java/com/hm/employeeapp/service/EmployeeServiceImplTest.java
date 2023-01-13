package com.hm.employeeapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hm.employeeapp.exception.EmployeeNotFoundException;
import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.repository.EmployeeRepository;

@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	EmployeeService service;
	
	@BeforeEach
	@Transactional
	void addSomeData(){
		Employee emp1=new Employee(1001, "Rahul", "rahul@yahoo.com", LocalDate.of(2020,10,10));
		Employee emp2=new Employee(1002, "Suraj", "suraj@yahoo.com", LocalDate.of(2021,5,10));
		Employee emp3=new Employee(1003, "Manish", "manish@yahoo.com", LocalDate.of(2019,10,20));
		service.addEmployee(emp1);
		service.addEmployee(emp2);
		service.addEmployee(emp3);
		
	}
	
	@AfterEach
	void clearData(){
		service.deleteEmployee(1001);
		service.deleteEmployee(1002);
		service.deleteEmployee(1003);
	}
	
	@Test
	void testAddEmployee() {
		Employee emp = new Employee(5001,"Karan","karan@yahoo.com",LocalDate.of(2020, 8,10));
		
		service.addEmployee(emp);
		
		assertNotNull(service.getEmployee(emp.getEmployeeId()));
		
	}

	@Test
	void testGetEmployee() {
		assertNotNull(service.getEmployee(1001));
		assertNotNull(service.getEmployee(8001));
		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(1000));
	}
//
//	@Test
//	void testDeleteEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testUpdateEmployee() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllEmployees() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetEmployeeByName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetEmployeeByEmail() {
//		fail("Not yet implemented");
//	}

}
