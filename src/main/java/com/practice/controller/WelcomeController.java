package com.practice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.service.WelcomeService;

@RestController
public class WelcomeController {

	// Auto wiring
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@GetMapping("/hello")
	public String getMessage() {
		return "Good Afternoon";
	}

	@GetMapping("/bookByRequestParam")
	public String getBook(@RequestParam int bookId, @RequestParam String name) {
		if (bookId == 1 && name.equals("JAVA")) {
			return "Effective Java";
		} else if (bookId == 2 && name.equals("JAVA")) {
			return "Clean Code";
		} else {
			return "No Book found!";
		}
	}

	@GetMapping("/bookByMap")
	public String getBookUsingMap(@RequestParam Map<String, String> map) {
		int bookId = Integer.valueOf(map.get("bookId"));
		String name = map.get("name");
		if (bookId == 1 && name.equals("JAVA")) {
			return "Effective Java";
		} else if (bookId == 2 && name.equals("JAVA")) {
			return "Clean Code";
		} else {
			return "No Book found!";
		}
	}
}