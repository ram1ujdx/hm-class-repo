package com.hm.interfaceexample;




public class ShowableImplMain {

	public static void main(String[] args) {
		Showable obj = new Showable() {
			public void show() {
				System.out.println("Hey there...");
			}	
			
		};
		obj.show();
		
		
		// Lambda Expression
		
		Showable obj2= ()->System.out.println("This is another implementation");
		
		obj2.show();
	}
	
	
}
