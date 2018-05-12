package com.pk.rest.ws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world/{name}")
	public String SayHelloWorld(@PathVariable String name) {
		return "Hello world " + name + "!";
	}

	@GetMapping("/")
	public String SayHelloWorld() {
		return "Hello world";
	}
}
