package com.service.book.service;

import com.service.book.entity.Book;

public interface IBookService {

	public Book addBook(Book b);

	public Book editBook(Book b, Integer bookId);

	public Boolean blockBook(String block);

	public Boolean unblockBook(String block);

}
