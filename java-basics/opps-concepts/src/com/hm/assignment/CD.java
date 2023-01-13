package com.hm.assignment;

public class CD extends MediaItem {

	private String artist;
	private String genre;
	
	
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CD(int id, String title, int noOfCopies, int runtime, String artist, String genre) {
		super(id, title, noOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
		
	}
	
	
	

	@Override
	public void addItem() {
		System.out.println("Added a CD");
	}
	@Override
	public void checkIn() {
		System.out.println("Checked-in CD");
		
	}
	@Override
	public void checkOut() {
		System.out.println("Checked-out CD");
	}
	
	@Override
	public void play() {
		System.out.println("Playing "+getTitle());
	}
	
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + super.toString() + "]";
	}
	
	
	
}
