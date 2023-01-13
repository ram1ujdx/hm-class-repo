package com.hm.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (;;) {

			System.out.println("Hello world..");
			int a, b, result;
			System.out.println("Enter values for a and b");
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("We are trying to divide "+a+" by "+b);
			try {
				result = a / b;
				System.out.println("Result = " + result);
			} catch (Exception e) {
				System.err.println("Sorry we cant divide a no. by zero");
			}
			System.out.println("Completed the operation");
			System.out.println("Do you want to continue?(y/n) : ");
			char ch=scan.next().charAt(0);
			if(ch=='n') {
				break;
			}
			
		}
		System.out.println("Bye..");

	}

}
