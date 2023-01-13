package com.hm.employeeapp.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.repository.EmployeeRepository;
@ExtendWith(SpringExtension.class)
class EmployeeServiceImplUnitTest {

	@InjectMocks
	private EmployeeServiceImpl service;
	
	@Mock
	private EmployeeRepository repo;
	
	@Test
	void testGetEmployee() {
		Employee emp = new Employee(1001, "Kamal", "kamal@yahoo.com", LocalDate.of(2020, 10, 10));
		when(repo.findById(1001)).thenReturn(Optional.of(emp));
		
		assertEquals(emp, service.getEmployee(1001));
		
	}

}
