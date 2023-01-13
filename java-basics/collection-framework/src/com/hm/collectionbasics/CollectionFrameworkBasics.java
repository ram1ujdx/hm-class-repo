package com.hm.collectionbasics;

import java.util.*;

public class CollectionFrameworkBasics {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		
		int []arr= new int[5];
		
		items.add("Amit");
		items.add("Rahul");
		items.add("Suraj");
		items.add("Karan");
		items.add("Karan");
		items.add("Karan");
		
		Collections.sort(items);
	
		
//		for(var item:items) {
//			System.out.println(item);
//		}
		
//		String str = "Suraj";
//		
//		System.out.println(items.indexOf(str));
//		
//		Collections.reverse(items);
		
//		for(var item:items) {
//			if(item.equals(str)) {
//				System.out.println(item);
//			}
//		}
		
		
		
		System.out.println(items);
		
	}
	
}
