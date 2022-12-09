package com.service.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.book.entity.Book;
import com.service.book.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	public BookRepository bookRepository;

	@Override
	public Book addBook(Book b) {
		return bookRepository.save(b);
	}

	@Override
	public Book editBook(Book b, Integer bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean blockBook(String block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean unblockBook(String block) {
		// TODO Auto-generated method stub
		return null;
	}

}
