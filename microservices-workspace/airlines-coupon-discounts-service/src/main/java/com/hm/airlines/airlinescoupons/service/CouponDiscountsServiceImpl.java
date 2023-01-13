package com.hm.airlines.airlinescoupons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.airlines.airlinescoupons.model.Coupon;
import com.hm.airlines.airlinescoupons.repository.CouponDiscountsRepository;

@Service
public class CouponDiscountsServiceImpl implements CouponDiscountsService {
	
	@Autowired
	private CouponDiscountsRepository repo;

	public Coupon getCoupon(String couponCode) {
		return repo.getCouponByCode(couponCode);
	}
}
