package com.hm.employeapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "employee_info")
@NamedQuery(query = "from Employee where email=:email", name = "queryByEmail")
public class Employee {

	@Id
	@Column(name = "employee_id")
	private long employeeId;
	
	@Column(name = "employee_name", length = 50, 
							nullable = false)
	private String employeeName;
	
	@Column(unique = true)
	private String email;
	
	@Column(name = "join_date")
	private LocalDate joinDate;
	
	@OneToMany(mappedBy = "employee")
	private List<Laptop> laptops = new ArrayList<>();

	public Employee(long employeeId, String employeeName, String email, LocalDate joinDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", joinDate=" + joinDate + "]";
	}
	
	
	
}
