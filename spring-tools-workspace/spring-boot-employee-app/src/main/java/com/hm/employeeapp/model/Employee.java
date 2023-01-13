package com.hm.employeeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "employee_records")
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String email;
	
}
