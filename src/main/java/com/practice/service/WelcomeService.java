package com.practice.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		// Complex Method
		return "Good Morning updated";
	}
}