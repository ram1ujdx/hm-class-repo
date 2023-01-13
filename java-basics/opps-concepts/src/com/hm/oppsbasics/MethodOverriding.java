package com.hm.oppsbasics;

abstract class Enemy{
	abstract void attack();
}

class Ninja extends Enemy{
	void attack(){
		System.out.println("Attacked by Ninja");
	}
}

class Monster extends Enemy{
	void attack(){
		System.out.println("Attacked by Monster");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Enemy enemy = new Ninja();
		enemy.attack();
		enemy = new Monster();
		enemy.attack();
	}
	
	
}
