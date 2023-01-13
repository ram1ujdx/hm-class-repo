package com.hm.example;

public class StringSplitting {

	public static void main(String[] args) {
		
		String str = "Hello everyone, how are you?";
		
		String []arr= str.split(" ");
		
		for(String s:arr) {
			System.out.println(s.charAt(0)+".");
		}
		
	}
	
}
