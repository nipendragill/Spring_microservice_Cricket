package com.cricket_app.basics.cricket_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		List<Book> book = new ArrayList<>();
		book.add(new Book(1,"first book", "nipendra gill"));
		return book;
	}
	
	
}
