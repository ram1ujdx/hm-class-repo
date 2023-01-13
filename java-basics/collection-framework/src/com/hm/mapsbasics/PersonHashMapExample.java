package com.hm.mapsbasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.hm.collectionbasics.Person;

public class PersonHashMapExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("Rahul","rahul@yahoo.com",25);
		Person p2 = new Person("Gaurav","gaurav@gmail.com",28);
		Person p3 = new Person("Priyanka", "priya@yahoo.com", 26);
		Person p4 = new Person("Javed","javed@gmail.com",28);
		
		Map<String, Person> personList = new HashMap<>();
		
		personList.put(p1.getPersonName(), p1);
		personList.put(p2.getPersonName(), p2);
		personList.put(p3.getPersonName(), p3);
		personList.put(p4.getPersonName(), p4);
		
		
		System.out.println("Enter a name : ");
		String name = new Scanner(System.in).nextLine();
		
		Person p = personList.get(name);
		
		System.out.println(p);
		
				
		
	}
	
}
