package com.hm.assignment;

public class AppMain {

	public static void main(String[] args) {
		Item item = new Book(1001,"Java Programming",10,"James");
		
		item.checkIn();
		item.addItem();
		item.checkOut();
		System.out.println(item);
			
		
		MediaItem item2 = new CD(1002, "Angular Tutorials", 5, 20, "Navin Reddy", "Technology");
		
		item2.checkIn();
		item2.addItem();
		item2.checkOut();
		item2.play();
		System.out.println(item2);
	
	}
	
	
}
