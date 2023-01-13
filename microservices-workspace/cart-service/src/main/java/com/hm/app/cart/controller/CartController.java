package com.hm.app.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.app.cart.model.Cart;
import com.hm.app.cart.service.CartService;
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService service;

	@PostMapping
	public Cart addItems(@RequestBody Cart cart) {
		return service.addToCart(cart);
	}
	
	@GetMapping("/{userId}")
	public Cart getCartItems(@PathVariable long userId) {
		return service.getCart(userId);
	}
	
}
