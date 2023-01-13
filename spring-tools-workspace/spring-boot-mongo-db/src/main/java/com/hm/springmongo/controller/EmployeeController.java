package com.hm.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hm.springmongo.model.Employee;
import com.hm.springmongo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service; 

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAlEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/name/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return service.getEmployeeByName(name);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id) {
		service.deleteEmployee(id);
	}

	@PutMapping
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
		
	}
	
	@GetMapping("/search")
	public Employee getEmployeeByEmail(@RequestParam("email") String email) {
		return service.getEmployeeByEmail(email);
	}
	
}
