package com.hm.assignment;

public class Book extends WrittenItem {
	
	

	public Book() {
	
	}

	public Book(int id, String title, int noOfCopies, String author) {
		super(id, title, noOfCopies, author);
	}

	@Override
	public void addItem() {
		System.out.println("Added a Book");
	}

	@Override
	public void checkIn() {
		System.out.println("Checked-in Book");
	}

	@Override
	public void checkOut() {
		System.out.println("Checked-out Book");
		
	}

	@Override
	public String toString() {
		return "Book [Author=" + super.toString() + "]";
	}

	
	
	
	
}
