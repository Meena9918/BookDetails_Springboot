package com.books.demo.service;

import java.util.List;

import com.books.demo.model.Book;

public interface BookService {

	Book saveBook(Book book);

	Book findOneBook(Integer id);

	Book updateBook(Integer id, Book newData);

	List<Book> findAllBook();

	void deleteBook(Integer id);

}
