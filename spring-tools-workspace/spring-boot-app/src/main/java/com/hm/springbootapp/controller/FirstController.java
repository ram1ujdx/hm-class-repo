package com.hm.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hm.springbootapp.model.Person;


@RestController
public class FirstController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/person")
	public Person getPerson() {
		Person p = new Person("Rohan","rohan@yahoo.com",25);
		return p;
	}
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		System.out.println(person);
		return person;
	}
	
	
}
