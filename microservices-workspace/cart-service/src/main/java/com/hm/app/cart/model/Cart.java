package com.hm.app.cart.model;

import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Cart {

	@Id
	private long userId;
	
	@ElementCollection
	private Set<Long> items;
	
}
