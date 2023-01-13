package com.hm.collectionbasics;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Comparator<String> sortReverse = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		};
		
		Set<String> items = new TreeSet<>(sortReverse);
		
		items.add("Javed");
		items.add("Harsh");
		items.add("Amit");
		items.add("Nayak");
		
		System.out.println(items);
		
		
	}
	
}
