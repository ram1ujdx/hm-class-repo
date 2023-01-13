package com.hm.springmongo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Document("employee")
public class Employee {

	@Id
	@JsonProperty("id")
	private long _id;
	private int employeeId;
	private String employeeName;
	private String email;
	private LocalDate joinDate;
	
}
