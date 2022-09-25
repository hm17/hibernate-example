package com.hm17;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hm17.models.Book;
import com.hm17.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return service.list();
	}
	
	@GetMapping("/books/{id}")
	public Optional<Book> getBookById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		service.add(book);
	}

}
