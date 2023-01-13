package com.hm.java8;

interface Player{
	public void play(String playerName);
}

interface FindLargest{
	public void printLargest(int a, int b);
}

public class LamdaExpressionWithArguments {

	public static void main(String[] args) {
		
		FindLargest obj = (a,b)->{
			int largest = a>b ? a : b;
			System.out.println(largest);
		};
		
		obj.printLargest(10, 15);
		
		Player p1 = pName -> System.out.println(pName);
			
		
		p1.play("Gaurav");
	}
	
}
