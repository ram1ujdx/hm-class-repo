package com.hm.interfaceexample;

public class HpPrinter implements Printable, Scannable {

	@Override
	public void print() {
		System.out.println("Printing using HP Printer");
	}
	
	@Override
	public void scan() {
		System.out.println("Scanning Documents using HP Printer");
	}
	
}
