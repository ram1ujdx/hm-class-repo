package com.hm.mobilestore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MobileStoreTest {
	
	MobileStore ms;

	@BeforeEach
	public void init() {
		ms = new MobileStore();
	}
	
	@Test
	public void getPhoneByBrandNameTest() {
		assertFalse(ms.findPhoneByBrand("Apple").isEmpty());
		
	}
	
	
}
