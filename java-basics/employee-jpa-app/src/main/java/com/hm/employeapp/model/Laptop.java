package com.hm.employeapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Laptop {

	@Id
	private int laptopId;
	private String brand;
	private String model;
	private String processor;
	@ManyToOne
	private Employee employee;
	public Laptop(int laptopId, String brand, String model, String processor) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.model = model;
		this.processor = processor;
	}
	
	
	
}
