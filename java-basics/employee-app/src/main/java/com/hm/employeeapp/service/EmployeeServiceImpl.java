package com.hm.employeeapp.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hm.employeeapp.dao.EmployeeDao;
import com.hm.employeeapp.dao.EmployeeDaoImpl;
import com.hm.employeeapp.dao.EmployeeDaoJdbcImpl;
import com.hm.employeeapp.dao.EmployeeDaoJpaImpl;
import com.hm.employeeapp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService, InitializingBean, DisposableBean {
	
	@Autowired
	@Qualifier("jdbcDao")
	private EmployeeDao dao;
	
	public EmployeeServiceImpl() {
		System.out.println("Inside Service Constructor");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(dao);
		
	}
	

	@Override
	public Employee serachEmployee(int employeeId) throws SQLException{
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public void addEmplopyee(Employee employee) throws SQLException {
		 dao.saveEmployee(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		dao.deleteEmployee(employeeId);

	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		return dao.getAllEmployees();
	}

	@Override
	public void destroy() throws Exception {
		
	}


	

}
