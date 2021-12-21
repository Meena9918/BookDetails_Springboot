package com.books.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.demo.model.Book;
import com.books.demo.repository.BookRepository;
import com.books.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book saveBook(Book book) {

		return bookRepo.save(book);
	}

	@Override
	public Book findOneBook(Integer id) {

		return bookRepo.findById(id).get();
	}

	@Override
	public Book updateBook(Integer id, Book newData) {

		Book oldData = findOneBook(id);

		oldData.setBookName(newData.getBookName());
		oldData.setAuthor(newData.getAuthor());
		oldData.setStoryMode(newData.getStoryMode());
		oldData.setPrice(newData.getPrice());

		bookRepo.save(oldData);

		return oldData;
	}

	@Override
	public List<Book> findAllBook() {
		List<Book> books = bookRepo.findAll();
		System.out.println("Getting data from DB : " + books);
		return books;
	}

	@Override
	public void deleteBook(Integer id) {

		bookRepo.deleteById(id);

	}

}
