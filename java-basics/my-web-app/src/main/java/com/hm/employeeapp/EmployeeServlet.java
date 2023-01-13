package com.hm.employeeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.employeeapp.model.Employee;
import com.hm.employeeapp.service.EmployeeService;
import com.hm.employeeapp.service.EmployeeServiceImpl;


@WebServlet("/add-employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int employeeId =Integer.parseInt(request.getParameter("employeeId"));
		String employeeName = request.getParameter("employeeName");
		float salary =Float.parseFloat(request.getParameter("salary"));
		
		Employee emp = new Employee(employeeId, employeeName, salary);
		
		EmployeeService service = new EmployeeServiceImpl();
		
		try {
			service.addEmplopyee(emp);
			out.print("Employee Saved");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		

//		
//		out.print("ID : "+employeeId);
//		out.print("Name : "+employeeName);
//		out.print("Salary : "+salary);
//		
		
	}

}
