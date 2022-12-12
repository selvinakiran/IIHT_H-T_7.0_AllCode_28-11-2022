package com.book.service;

import java.util.List;

import com.book.entity.Book;

public interface IBookService {

	public Book createBook(Book newBook);
	
	public List<Book> getAllBooks();

	public Book getLoginById(Integer id);
	
	public void subscribeBookById(Integer id);

}
