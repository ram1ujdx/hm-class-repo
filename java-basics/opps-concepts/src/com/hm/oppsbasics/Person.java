package com.hm.oppsbasics;

public class Person {

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
}
