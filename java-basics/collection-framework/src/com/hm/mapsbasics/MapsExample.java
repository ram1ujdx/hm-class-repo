package com.hm.mapsbasics;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		
		Map<Integer, String> wordMap = new HashMap<>();
		
		wordMap.put(1, "One");
		wordMap.put(2, "Two");
		wordMap.put(3,"Three");
		wordMap.put(1, "Ondu");
		wordMap.put(2, "Erdu");
		
		
		String value = wordMap.get(1);
		
		System.out.println(value);
		
		
	}
	
}
