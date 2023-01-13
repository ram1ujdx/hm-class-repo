package com.hm.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiBasics {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(10,5,7,20,17);
		
		stream.forEach(i->System.out.println(i));
		
//		stream.forEach(i->System.out.println(i));
		
		List<Integer> list = Arrays.asList(20,7,8,5,15,30);
		
		list.stream().forEach(i->System.out.println(i));
		list.stream().forEach(i->System.out.println(i));
		
		
	}
	
}
