package com.hm.collectionbasics;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class CompareByAge implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge()-p2.getAge();
	}
}



public class QueueExample {

	public static void main(String[] args) {
		
		Comparator<Person> comapreByAge = new CompareByAge();
		
		
		// Using Inner Class
		Comparator<Person> comapreByName = new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getPersonName().compareTo(p2.getPersonName());
			}
		};
		
		
		// Using Lambda Expression
		Comparator<Person> compareByAge2 = (c1,c2)->c1.getAge()-c2.getAge();
		
		Queue<Person> personQueue = new PriorityQueue<>(compareByAge2);
		
		
		Person p1 = new Person("Rahul","rahul@yahoo.com",25);
		Person p2 = new Person("Gaurav","gaurav@gmail.com",28);
		Person p3 = new Person("Priyanka", "priya@yahoo.com", 26);
		Person p4 = new Person("Varun","varun@gmail.com",22);
		
	
		
		personQueue.add(p1);
		personQueue.add(p2);
		personQueue.add(p3);
		personQueue.add(p4);
		
		while(!personQueue.isEmpty()) {
			System.out.println(personQueue.poll());
		}
		
//		Queue<String> values = new PriorityQueue<>();
//		
//	
//		values.add("Karan");
//		values.add("Suraj");
//		values.add("Mohit");
//		values.add("Harsh");
//		values.add("Amit");
//		
//		while(!values.isEmpty()) {
//			System.out.println(values.poll());
//		}
		
		
		
	}
	
}
