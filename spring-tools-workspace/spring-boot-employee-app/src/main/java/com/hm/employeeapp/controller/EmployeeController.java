package com.hm.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hm.employeeapp.model.Employee;

import com.hm.employeeapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service; 

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAlEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/employees/name/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return service.getEmployeeByName(name);
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id) {
		service.deleteEmployee(id);
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
		
	}
	
}
