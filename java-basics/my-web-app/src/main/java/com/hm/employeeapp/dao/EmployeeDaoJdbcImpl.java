package com.hm.employeeapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hm.employeeapp.exception.EmployeeNotFoundException;
import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.util.DbConnectionUtil;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	Connection conn;
	PreparedStatement psmt;
	
	

	@Override
	public void saveEmployee(Employee emp) throws SQLException {

		conn = DbConnectionUtil.getDbConnection();
		psmt = conn.prepareStatement("insert into emp_db values(?,?,?)");
		psmt.setInt(1, emp.getEmployeeId());
		psmt.setString(2, emp.getEmployeeName());
		psmt.setFloat(3, emp.getSalary());
		psmt.executeUpdate();

	}

	@Override
	public Employee getEmployeeById(int employeeId) throws SQLException {
		conn = DbConnectionUtil.getDbConnection();
		psmt = conn.prepareStatement("select * from emp_db where employee_id=?");
		psmt.setInt(1, employeeId);
		ResultSet rs = psmt.executeQuery();
		if (rs.next()) {
			String employeeName = rs.getString("employee_name");
			float salary = rs.getFloat("salary");
			Employee emp = new Employee(employeeId, employeeName, salary);
			return emp;
		}
		else {
			throw new EmployeeNotFoundException("Employee with ID : "+employeeId+" Not Found!!");
		}

	}

	@Override
	public void deleteEmployee(int employeeId) {
		
	}

	@Override
	public List<Employee> getAllEmployees()throws SQLException {
		conn = DbConnectionUtil.getDbConnection();
		psmt = conn.prepareStatement("select * from emp_db");
		ResultSet rs = psmt.executeQuery();
		List<Employee> employeeList = new ArrayList<>();
		while(rs.next()) {
			int employeeId=rs.getInt("employee_id");
			String employeeName = rs.getString("employee_name");
			float salary = rs.getFloat("salary");
			Employee emp = new Employee(employeeId, employeeName, salary);
			employeeList.add(emp);
		}

		return employeeList;
	}

}
