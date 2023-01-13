package com.hm.app.items.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
@Entity
public class Item {

	@Id
	private long id;
	private String itemName;
	private double price;
	
}
