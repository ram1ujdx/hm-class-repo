package com.hm.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingException {
	
	public static void readAge() throws InvalidAgeException{
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
		age = scan.nextInt();
		
		if(age<=0 || age>100) {
			throw new InvalidAgeException("Invalid Age");
		}
		System.out.println("Age : "+age);
	}
	
	

	public static void main(String[] args) {
		try {
		readAge();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		
		
	}
	
	
	
}
