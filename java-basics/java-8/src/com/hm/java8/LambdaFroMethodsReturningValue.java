package com.hm.java8;

interface Calculator{
	
	public int calculate(int a, int b);
}

public class LambdaFroMethodsReturningValue {

	public static void main(String[] args) {
		
		Calculator calc = (a,b)-> a+b;
		
		int sum = calc.calculate(10, 20);
		
		System.out.println(sum);
		
	}
	
}
