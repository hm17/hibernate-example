package com.hm17;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hm17.models.Book;
import com.hm17.services.BookService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceUnitTest {
	
	@Autowired
	private BookService bookService;
	
	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		List<Book> books = bookService.list();
		
		assertEquals(books.size(), 3);
	}

}
