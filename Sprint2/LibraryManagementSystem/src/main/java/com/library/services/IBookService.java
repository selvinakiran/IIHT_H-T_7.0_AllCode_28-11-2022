package com.library.services;

import java.util.List;

import com.library.entity.Book;

public interface IBookService {

	public Book createBook(Book newBook);

	public List<Book> getAllBooks();

	public Book getBookById(Long id);

	public Book updateBook(Long id, Book updateBook);

	public void changeBookStatus(Long id, Boolean isBorrowed);
	
	public void changeBookStatus2(Long id);

	public void deleteBook(Long id);

}
