package com.hm.oppsbasics;


class Calculator{
	public int add(int a, int b){
		System.out.println("Add with two integers as arguments");
		return a+b;
	}

	public int add(int a, int b, int c){
		System.out.println("Add with three integers as arguments");
		return a+b+c;
	}

	public float add(float a, float b){
		System.out.println("Add with two floats as arguments");
		return a+b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		var result = c.add(10.5f, 15);
		System.out.println(result);
	}
	
}


