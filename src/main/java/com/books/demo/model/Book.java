package com.books.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String bookName;
	private String author;
	private String storyMode;
	private Integer price;

	public Book() {
	}

	public Book(String bookName, String author, String storyMode, Integer price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.storyMode = storyMode;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStoryMode() {
		return storyMode;
	}

	public void setStoryMode(String storyMode) {
		this.storyMode = storyMode;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
