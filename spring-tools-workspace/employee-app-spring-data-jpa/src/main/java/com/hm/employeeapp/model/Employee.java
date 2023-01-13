package com.hm.employeeapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee_records")
@AllArgsConstructor @NoArgsConstructor
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joinDate;
	
}
