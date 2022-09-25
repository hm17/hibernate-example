package com.hm17.services;

import java.util.List;
import java.util.Optional;

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
	
	public void add(Book book) {
		bookRepository.save(book);
	}

	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
		
	}

}
