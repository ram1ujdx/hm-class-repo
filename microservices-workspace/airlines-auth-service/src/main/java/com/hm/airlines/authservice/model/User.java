package com.hm.airlines.authservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private int userId;
	@Column(unique = true)
	private String username;
	private String password;
	@Enumerated
	private UserType role;
	
}
