package com.hm.multithreading;




public class MultiThreading {

	public static void main(String[] args) {
		MultiTable table = new MultiTable();
		Runnable r1 = ()->{
			table.printTable(10);
		};
		Runnable r2 = ()->{
			table.printTable(5);;	
			
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t2.start();
		t1.start();
		
	}
	
}

class MultiTable{
	public synchronized void printTable(int num)
	{
		for(int n=1; n<=10; n++) {
			System.out.println(num+" x "+n+" = "+n*num);
		}
		
	}
}