package com.helloworld.hellowWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World from Spring + GCP + Docker + Kubernetes + git + gitAction";
	}

}
