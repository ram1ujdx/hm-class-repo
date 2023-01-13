package com.hm.assignment;

public abstract class Item {

	private int id;
	private String title;
	private int noOfCopies;
	
	public Item() {
		
	}
	
	public abstract void addItem();
	public abstract void checkIn();
	public abstract void checkOut();
	

	public Item(int id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}
	
	
	
}
