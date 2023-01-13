package com.hm.bookstore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookStroreTest {

	@Test
	public void calculateDiscountTest() {
		Book book = new Book(1001, "Java Development Handbook", "Harsh Gupta", "Technology", 1000);
		BookStore obj = new BookStore();
		float actual = obj.calculateDiscount(book, 10);
		float expected = 100;
		
		assertEquals(expected, actual);
		
		
		
	}

}
