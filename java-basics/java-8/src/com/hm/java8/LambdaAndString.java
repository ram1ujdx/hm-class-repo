package com.hm.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaAndString {
	public int countString(List<String> list) {
		
		return (int)list.stream().filter(s->s.length()>2).count();
		
//		list.forEach(s->{
//			if(s.length()>=3) {
//				count++;
//			}
//		});
//		return count;
	}
	
	
	public List<String> removeEmptyString(List<String> list){
		List<String> newList = new ArrayList<>();
		list.forEach(s->{
			if(!s.isBlank()) {
				newList.add(s);
			}
		});
		return newList;
	}
	
	public static void main(String[] args) {
		LambdaAndString obj = new LambdaAndString();
		List<String> list = Arrays.asList("Hello"," ","Cool"," ");
		System.out.println(obj.countString(list));
		List<String> output = obj.removeEmptyString(list);
		
		System.out.println(output);
		
	}
	
}
