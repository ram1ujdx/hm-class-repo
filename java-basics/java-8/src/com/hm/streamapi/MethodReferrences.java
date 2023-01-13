package com.hm.streamapi;

import java.util.Arrays;
import java.util.List;

public class MethodReferrences {

	public static void main(String[] args) {
		
		List<Integer> items = Arrays.asList(10,2,25,15,5);
		
		items.forEach(i->System.out.println("Num = "+i));
		
		// With method references
		
		items.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Harsh Kumar","Suraj","Mohit","Richa");
		
		// names.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		String str = names.stream()
						.filter(s->s.length()>10)
						.map(String::toUpperCase)
						.findFirst()
						.orElse("Nothing Found");
		
		System.out.println(str);
						
						//.get();
						//.orElseThrow(()->new RuntimeException("nothing found"));
		
		
	}
	
}
