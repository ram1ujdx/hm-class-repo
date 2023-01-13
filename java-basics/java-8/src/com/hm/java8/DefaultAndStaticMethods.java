package com.hm.java8;

interface Printable{
	public default void print() {
		System.out.println("Defalut Method");
	}
	
	public static void scan() {
		System.out.println("Scanning in Progress");
	}

}

interface Playable{
	public default void print() {
		System.out.println("Lets Play");
	}
}

class Printer implements Printable, Playable{

	public void print() {
		System.out.println("Printing from the Printer Class");
	}
}

public class DefaultAndStaticMethods {

	public static void main(String[] args) {
		Printer p1= new Printer();
		p1.print();
		
		Printable.scan();
	}
	
}
