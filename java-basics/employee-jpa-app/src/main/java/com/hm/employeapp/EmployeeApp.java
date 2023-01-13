package com.hm.employeapp;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.hm.employeapp.model.Employee;
import com.hm.employeapp.model.Laptop;

public class EmployeeApp {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("employee-persistence");
		
		EntityManager emgr = factory.createEntityManager();
		
		EntityTransaction etx = emgr.getTransaction();
		
		// Adding new Employee
		
		Laptop l1= new Laptop(5001, "Acer", "Travel Mate", "11th Gen i5 Processor");
		Laptop l2= new Laptop(5002, "HP", "Spectre", "12th Gen i7 Processor");
		Laptop l3= new Laptop(5003, "Apple", "MacBook Pro", "M1 Pro Processor");
		Laptop l4= new Laptop(5004, "Dell", "XPS", "12th Gen i9 Processor");
		
		Employee emp1 = new Employee(1002,"Ramesh","ramesh@yahoo.com",
				LocalDate.of(2020, 10, 15));
		
		Employee emp2 = new Employee(1003,"Neel","neel@yahoo.com",
				LocalDate.of(2021, 11, 25));
		
		emp1.getLaptops().add(l1);
		emp1.getLaptops().add(l2);
		
		emp2.getLaptops().add(l3);
		emp2.getLaptops().add(l4);
		
//		Employee emp3 = new Employee(1004,"Nithin","nithin@yahoo.com",
//				LocalDate.of(2022, 8, 17));
//		
//		Employee emp4 = new Employee(1005,"Mukesh","mukesh@yahoo.com",
//				LocalDate.of(2021, 5, 10));
		
		etx.begin();
		
		emgr.persist(l1);
		emgr.persist(l2);
		emgr.persist(l3);
		emgr.persist(l4);
		
		emgr.persist(emp1);
		emgr.persist(emp2);
//		emgr.persist(emp3);
//		emgr.persist(emp4);
		
		etx.commit();
		
		
//		 Fetch Employee
		
//		Employee emp = emgr.find(Employee.class, 1002L);
//		
//		System.out.println(emp);
		
		
		// Delete Employee
		
//		Employee emp = emgr.find(Employee.class, 1002L);
//		
//		emgr.remove(emp);
		
		// Update Employee
		
//		Employee emp = emgr.find(Employee.class, 1003L);
//		
//		emp.setEmployeeName("Karan Neel");
//		
//		etx.commit();
		
		// Fetching all the employees
		
//		TypedQuery<Employee> query = 
//				emgr.createQuery("from Employee",Employee.class);
//		
//		List<Employee> employees = query.getResultList();
//		
//		employees.forEach(e->System.out.println(e));
		
		// Fetch employee by name
		
//		TypedQuery<Employee> query = 
//				emgr.createQuery("from Employee where employeeName=:employeeName", Employee.class);
//		query.setParameter("employeeName", "Mukesh");
//		Employee emp = query.getSingleResult();
//		
//		System.out.println(emp);
		
		// Using named query
		
//		Query query = emgr.createNamedQuery("queryByEmail");
//		query.setParameter("email", "mukesh@yahoo.com");
//		Employee emp =(Employee) query.getSingleResult();
//		System.out.println(emp);
		
		// Using Native Query
		
//		Query query1 = 
//				emgr.createNativeQuery("select * from employee_info where employee_name=:employeeName", Employee.class);
//		
//		query1.setParameter("employeeName", "Mukesh");
//		emp = (Employee)query1.getSingleResult();
//		System.out.println(emp);
		
		
	}
	
}
