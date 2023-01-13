package com.hm.collectionbasics;

public class GenericsExample {

	public static void main(String[] args) {
		
		Calculator<String> calc = new Calculator<>();
	}
}

class Calculator<T>{
	
	T a, b;
	
	public T add(T a, T b) {
		return a;
	}
	
}