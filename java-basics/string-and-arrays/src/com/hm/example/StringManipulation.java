package com.hm.example;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		
		String output;
		
		StringBuilder revStr = new StringBuilder(str1);
		int j=str1.length()-1;
		
		char []chars= str1.toCharArray();
		
		for(char ch:chars) {
			revStr.setCharAt(j, ch);
			j--;
		}
		
		
		
		output=str1+"|"+revStr;
		
		System.out.println(output);
		
		
		
		
		// setCharAt()
		// charAt()
		// reverse()
		
		
		
		
		
	}

}
