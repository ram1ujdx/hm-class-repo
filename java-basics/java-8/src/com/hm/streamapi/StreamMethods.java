package com.hm.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamMethods {

	// From a list of numbers find all the even numbers
	// Double the numbers
	// Add the doubled numbers and print the sum
	
	public static List<Integer> getEvens(List<Integer> list){
		List<Integer> evens = new ArrayList<>();
		list.forEach(i->{
			if(i%2==0) {
				evens.add(i);
			}
		});
		return evens;
	}
	
	
	public static List<Integer> getDoubles(List<Integer> list){
		List<Integer> doubles = new ArrayList<>();
		list.forEach(i->{
				doubles.add(i*2);
		});
		return doubles;
	}
	
	public static int getSum(List<Integer> list) {
		int sum = 0;
		for(int n:list) {
			sum+=n;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,3,7,11,1,2);
		
		 List<Integer> doubles = list.stream().filter(i->i%2==0)
					.map(i->i*2)
					.toList();
		
		System.out.println(doubles);
		
		int num = list.stream().filter(n->n%5==0).findFirst()
						.orElseThrow(()->new ArithmeticException("No value found"));
		System.out.println(num);
		
//		List<Integer> evens = getEvens(list);
//		List<Integer> doubles = getDoubles(evens);
//		sum = getSum(doubles);
//		System.out.println(sum);
//		
		
	}
	
}
