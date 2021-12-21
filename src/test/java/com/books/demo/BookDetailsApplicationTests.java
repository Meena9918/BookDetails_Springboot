package com.books.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.books.demo.model.Book;
import com.books.demo.repository.BookRepository;
import com.books.demo.service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookDetailsApplicationTests {

	@Autowired
	private BookService bookService;

	@MockBean
	private BookRepository bookRepo;

	@Test
	public void getBooksTest() {
		when(bookRepo.findAll())
				.thenReturn(Stream.of(new Book("Comic", "TS", "Action", 100)).collect(Collectors.toList()));
		assertEquals(1, bookService.findAllBook().size());
	}
	
	public void getbyBook() {
//		when(bookRepo.findById(1))
	}

}
