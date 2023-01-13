package com.hm.exceptionhandling;

public class ExceptionHandlingWithArrays {

	public static void main(String[] args) {
		
		int []arr = {10,2,6,0};
		
		try {
		int output = arr[0]/arr[3];
		System.out.println(output);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
