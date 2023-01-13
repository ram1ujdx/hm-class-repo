package com.hm.assignment;

public abstract class WrittenItem extends Item {

	private String author;
	
	public WrittenItem() {
		
	}

	public WrittenItem(int id, String title, int noOfCopies, String author) {
		super(id, title, noOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]"+"Item : "+super.toString();
	}
	
	
	
}
