package com.hm.mapsbasics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCounter {

	public static void main(String[] args) {
		
		String str = "hello world";
		
		Map<Character, Integer> wordCounts = new HashMap<>();

		char []chars = str.toCharArray();


		for(char c : chars){
			if(wordCounts.containsKey(c)){
					int count = wordCounts.get(c)+1;
					wordCounts.put(c,count);
				}
			else{
				wordCounts.put(c,1);
			}

		
		}
		
		for(char c:wordCounts.keySet()) {
			System.out.println(c+" -> "+wordCounts.get(c));
		}
	}
}

