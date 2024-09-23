package com.hermes._z0819;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class class_1 {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello World!");
		return "Hello World!";
	}
	
}
