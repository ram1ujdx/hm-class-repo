package com.hm.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateExample {

	public static void main(String[] args) {
		
		// Declaring a Date
		LocalDate date = LocalDate.of(1995, 10, 20);
		// yyyy-MM-dd
		System.out.println(date);
		
		// Getting the current system date
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		// Comparing dates
		
		boolean ans = date.isBefore(currentDate);
		System.out.println(ans);
		
		ans = date.isAfter(currentDate);
		System.out.println(ans);
		
		// How to read a date from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a date : ");
		String dateString = scan.next();
		
		// By defalut format is yyyy-MM-dd
		//LocalDate mydate = LocalDate.parse(dateString);
		
		// dd-MM-yyyy
		LocalDate mydate = LocalDate.parse(dateString,
											DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(mydate);
	
		
		
	}
	
}
