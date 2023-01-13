package com.hm.airlines.airlinescoupons.repository;

import com.hm.airlines.airlinescoupons.model.Coupon;

public interface CouponDiscountsRepository {

	public Coupon getCouponByCode(String couponCode);
	
}
