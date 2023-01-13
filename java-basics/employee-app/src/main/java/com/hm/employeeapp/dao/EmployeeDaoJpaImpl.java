package com.hm.employeeapp.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hm.employeeapp.model.Employee;

public class EmployeeDaoJpaImpl implements EmployeeDao {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	
	
	public EmployeeDaoJpaImpl() {
		emf = Persistence.createEntityManagerFactory("employee-persistence");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	
	
	

	@Override
	public void saveEmployee(Employee emp) throws SQLException {
		
		tx.begin();
		em.persist(emp);
		tx.commit();
		
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws SQLException {
		
		return em.find(Employee.class, employeeId);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee emp = em.find(Employee.class, employeeId);
		tx.begin();
		em.persist(emp);
		tx.commit();
		
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		Query query = em.createQuery("from Employee");
		return query.getResultList();
	}

	
	
	
}
