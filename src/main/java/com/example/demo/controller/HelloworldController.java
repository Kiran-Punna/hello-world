package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@GetMapping("/hello")
	public String getHelloWorld() {
		return "Wellcome to SpringBoot"
				+ System.lineSeparator()
				+"I'm Running Now Successfully";
	}
}
