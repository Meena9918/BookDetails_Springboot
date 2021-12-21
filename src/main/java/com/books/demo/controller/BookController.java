package com.books.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.demo.model.Book;
import com.books.demo.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/add")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@GetMapping("/findOnebook/{id}")
	public Book findBook(@PathVariable Integer id) {
		return bookService.findOneBook(id);
	}

	@PutMapping("/updateBook/{id}")
	public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}

	@GetMapping("/findAll")
	public List<Book> findAllBook() {
		return bookService.findAllBook();
	}

	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
}
