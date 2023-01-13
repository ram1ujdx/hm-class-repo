package com.hm.java8;

interface Scannable{
	void scan();
	default void print() {
		
	}
}

public class LambdaExpression {

	public static void main(String[] args) {
//		Scannable scanner = new Scannable() {
//			public void scan() {
//				System.out.println("Scanner from inner class");
//			}
//		};
		
		Scannable scanner = ()-> System.out.println("Scanner from Lambda");
		scanner.scan();
	}
	
}
