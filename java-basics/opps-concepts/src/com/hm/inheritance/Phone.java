package com.hm.inheritance;

public class Phone {

	Sim sim = new AirtelSim();
	
	public void call() {
		sim.call();
	}
	
}
