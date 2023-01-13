package com.hm.collectionbasics;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> items = new Stack<>();
		
		items.push("Karan");
		items.push("Mohan");
		items.push("Isha");
		items.push("Varun");
		
		while(!items.empty()) {
			System.out.println(items.pop());
		}
		
		
	}
	
}
