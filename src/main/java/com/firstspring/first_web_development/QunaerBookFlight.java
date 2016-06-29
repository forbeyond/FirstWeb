package com.firstspring.first_web_development;

import org.springframework.stereotype.Component;

@Component
public class QunaerBookFlight implements BookService {
	
	public boolean bookFlight() {
		System.out.println("book flight by Qunaer!");
		return true;
	}
}
