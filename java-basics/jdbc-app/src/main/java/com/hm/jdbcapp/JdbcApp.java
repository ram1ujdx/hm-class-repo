package com.hm.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hm_db";
		String username = "root";
		String password = "password";

		try {
			// Create Connection
			Connection conn = DriverManager.getConnection(url, username, password);

			// Create Statement
			Statement stmt = conn.createStatement();

//			// Fetch Data From table
//			

//			
//			String query = "select * from dept";
//			
//			
//			
//			ResultSet rs = stmt.executeQuery(query);
//			
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int colCount = rsmd.getColumnCount();
//			
//			for(int i=1; i<=colCount; i++) {
//				System.out.printf("%-20s",rsmd.getColumnName(i));
//			}
//			
//			
//			System.out.println();
//			System.out.println("-------------------------------------------------------");
//			
//			while(rs.next()) {
//				for(int i=1; i<=colCount; i++) {
//					System.out.printf("%-20s",rs.getString(i));
//				}
//				System.out.println();
//			}
//			

			// Insert new record

//			int deptno = 60;
//			String dName = "L&D";
//			String location = "Chennai";
//			
//			String sql = "insert into dept values(?,?,?)";
//			PreparedStatement psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, deptno);
//			psmt.setString(2, dName);
//			psmt.setString(3, location);
//			
//			
//			int rowCount = psmt.executeUpdate();
//			if(rowCount!=0) {
//				System.out.println("Record Inserted Successfully");
//			}

			// Delete a record

			int deptno = 60;
		

			String sql = "delete from dept where deptno=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, deptno);

			int rowCount = psmt.executeUpdate();
			if (rowCount != 0) {
				System.out.println("Record Deleted Successfully");
			}
			else {
				System.out.println("No Records Found");
			}

		} catch (SQLException e) {
			System.err.println("Connection Failed");
			e.printStackTrace();
		}

	}

}
