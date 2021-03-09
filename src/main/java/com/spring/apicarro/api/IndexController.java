package com.spring.apicarro.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String get() {
		return "Get Spring Boot";
	}

	// aprendendo a passar parametro
	@GetMapping("/login")
	public String login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		return "Login: " + user + ", Pass: " + pass;
	}

}