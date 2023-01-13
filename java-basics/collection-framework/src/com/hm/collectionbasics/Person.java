package com.hm.collectionbasics;

import java.util.Objects;

public class Person implements Comparable<Person> {

	private String personName;
	private String email;
	private int age;
	
	public Person() {
	}
	
	public Person(String personName, String email, int age) {
		this.personName = personName;
		this.email = email;
		this.age = age;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sendEmail(String emailId) {
		System.out.println("Sent an email to "+emailId);
	}
	
	public void showDetails(){
		System.out.println("Name : "+personName);
		System.out.println("Email : "+email);
		System.out.println("Age : "+age);
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", email=" + email + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, email, personName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(personName, other.personName);
	}

	@Override
	public int compareTo(Person p) {
		return personName.compareTo(p.personName);
	}
	
	
	
}
