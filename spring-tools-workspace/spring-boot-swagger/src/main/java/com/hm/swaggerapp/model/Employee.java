package com.hm.swaggerapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String employeeName;
	private LocalDate joinDate;
	private String email;

}
