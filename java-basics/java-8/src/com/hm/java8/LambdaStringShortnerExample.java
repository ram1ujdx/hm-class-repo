package com.hm.java8;

interface StringShortner{
	public String shortenString(String str);
}

public class LambdaStringShortnerExample {

	public static void main(String[] args) {
		
		StringShortner obj = (str)->{
			String []arr = str.split(" ");
			String shortenString="";
			for(String s:arr) {
				shortenString+=s.charAt(0)+".";
			}
			return shortenString;
		};
		
		
		String output = obj.shortenString("Happiest Minds");
		System.out.println(output);
		
	}
	
}
