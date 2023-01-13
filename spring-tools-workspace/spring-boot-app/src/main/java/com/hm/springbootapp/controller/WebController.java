package com.hm.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/hello-mvc")
	public String sayHello() {
		return "hello-world.html";
	}
	
}
