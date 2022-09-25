package com.hm17.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm17.models.Book;
import com.hm17.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> list() {
		return bookRepository.findAll();
	}

}
