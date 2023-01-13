package com.hm.unittersting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CalculatorTest {
	
	Calculator calc;
	
	@BeforeAll
	public static void initTest() {
		System.out.println("Unit Testing Begins...");
	}

	@BeforeEach
	public void initEachTest() {
		calc = new Calculator();
		System.out.println("Calculator Object Initialized");
	}
	
	@AfterEach
	public void afterEachTest() {
		calc = null;
		System.out.println("Clearing memory..");
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("Testing Completeed...");
	}
	
	@Test
	@EnabledOnOs(value = OS.MAC)
	public void addTest() {
		
		assertEquals(15, calc.add(5, 10));
		assertEquals(-30, calc.add(-10,-20));
		assertEquals(5,calc.add(-10, 15));
		
	}
	
	
	
	@Test
	//@DisabledOnOs(value = OS.WINDOWS)
	//@DisabledOnJre(value = JRE.JAVA_17)
	public void divideTest() {
	
		assertEquals(5, calc.divide(10, 2));
		assertThrows(ArithmeticException.class, ()->calc.divide(5, 0) );
	}
	
	

}
