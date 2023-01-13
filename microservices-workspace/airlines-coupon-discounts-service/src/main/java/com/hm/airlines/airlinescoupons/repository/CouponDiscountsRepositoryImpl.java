package com.hm.airlines.airlinescoupons.repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.hm.airlines.airlinescoupons.model.Coupon;

@Repository
public class CouponDiscountsRepositoryImpl implements CouponDiscountsRepository {

	private Map<String, Coupon> couponDb;
	
	@PostConstruct
	public void init() {
		couponDb = new HashMap<>();
		couponDb.put("c1001", new Coupon("c1001", 10, LocalDate.of(2022, 12, 30)));
		couponDb.put("c2001", new Coupon("c2001", 12, LocalDate.of(2023, 1, 10)));
	}
	
	@Override
	public Coupon getCouponByCode(String couponCode) {
		return couponDb.get(couponCode);
	}
	
}
