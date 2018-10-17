package com.practise.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	
	WelcomeService(){
		System.out.println("WelcomeService Bean Created");
	}
	
	public String getWelcomeMessage(){
		return "Good Night!!";
	}

}
