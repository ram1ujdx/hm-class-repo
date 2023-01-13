package com.hm.employeeapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hm.employeeapp.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
@Transactional
public class EmployeeRepositoryJpaImpl implements EmployeeRepository {
	
	@PersistenceContext
	EntityManager emgr;

	@Override
	public Employee addEmployee(Employee employee) {
		emgr.persist(employee);
		return employee;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		Employee emp = emgr.find(Employee.class, employeeId);
		return emp;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee emp = emgr.find(Employee.class, employeeId);
		emgr.remove(emp);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return emgr.merge(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		Query query = emgr.createQuery("from Employee");
		return query.getResultList();
		
	}

	@Override
	public Employee getEmployeeByName(String employeeName) {
		Query query = emgr.createQuery("from Employee where employeeName=:employeeName");
		query.setParameter("employeeName", employeeName);
		return (Employee) query.getSingleResult();
	}

	
	
}
