package com.hm.airlines.airlinescoupons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hm.airlines.airlinescoupons.model.Coupon;
import com.hm.airlines.airlinescoupons.service.CouponDiscountsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/coupons")
@Slf4j
public class CouponDiscountsController {
	
//	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CouponDiscountsController.class);
	
	@Autowired
	private CouponDiscountsService service;

	@GetMapping("/{code}")
	public Coupon getCouponDetails(@PathVariable String code) {
		log.info("API Request made for a coupon with code "+code);
		return service.getCoupon(code);
				
	}
	
}
