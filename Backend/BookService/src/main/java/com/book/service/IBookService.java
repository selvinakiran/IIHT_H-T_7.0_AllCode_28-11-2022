package com.book.service;

import java.util.List;

import com.book.entity.Book;

public interface IBookService {

	public Book createBook(Book newBook);
	
	public List<Book> getAllBooks();

	public Book editBook(Book b, Integer bookId);

//	public Boolean blockBook(String block);
//
//	public Boolean unblockBook(String block);

}
