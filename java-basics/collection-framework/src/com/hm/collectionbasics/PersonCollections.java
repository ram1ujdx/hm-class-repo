package com.hm.collectionbasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PersonCollections {

	public static void main(String[] args) {
		
		Set<Person> personList = new HashSet<>();
		
		Person p1 = new Person("Rahul","rahul@yahoo.com",25);
		Person p2 = new Person("Gaurav","gaurav@gmail.com",28);
		Person p3 = new Person("Priyanka", "priya@yahoo.com", 26);
		Person p4 = new Person("Javed","javed@gmail.com",28);
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p3);
		personList.add(p4);
		
		// Read a person name from console and find the details of that person
//		System.out.println("Enter Person Name : ");
//		Scanner scan = new Scanner(System.in);
//		String pname = scan.nextLine();
//		
//		for(Person p:personList) {
//			if(p.getPersonName().equals(pname)) {
//				p.showDetails();
//			}
//		}
		
		for(Person p:personList) {
			System.out.println(p);
		}
		
	}
	
}
