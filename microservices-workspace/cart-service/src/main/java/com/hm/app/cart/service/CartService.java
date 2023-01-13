package com.hm.app.cart.service;

import com.hm.app.cart.model.Cart;

public interface CartService {

	public Cart addToCart(Cart cart);

	public Cart getCart(long userId);
	
}
