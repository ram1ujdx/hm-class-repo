package com.hm.app.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.app.cart.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Long> {

}
