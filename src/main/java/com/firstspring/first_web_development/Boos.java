package com.firstspring.first_web_development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boos {

	private BookService bookService;
	
	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	public BookService getBookService() {
		return bookService;
	}

	public void goSomeWhere() {
		bookService.bookFlight();
	}

}
