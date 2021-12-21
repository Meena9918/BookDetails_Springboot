package com.books.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.books.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
