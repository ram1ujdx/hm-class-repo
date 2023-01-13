package com.hm.app.cart.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.app.cart.model.Cart;
import com.hm.app.cart.repository.CartRepo;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo repo;

	@Override
	public Cart addToCart(Cart cart) {
		if (repo.existsById(cart.getUserId())) {
			Cart oldCart = repo.findById(cart.getUserId()).get();
			Set<Long> items = oldCart.getItems();
			items.addAll(cart.getItems());
			return repo.save(oldCart);
		} else {
			return repo.save(cart);
		}
	}

	@Override
	public Cart getCart(long userId) {
		return repo.findById(userId).get();
	}

}
