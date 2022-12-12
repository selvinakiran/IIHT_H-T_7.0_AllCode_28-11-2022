package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	public BookRepository bookRepo;

	@Override
	public Book createBook(Book newBook) {
		return bookRepo.save(newBook);
	}
	
	
	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}


	@Override
	public Book getLoginById(Integer id) {
		return bookRepo.findById(id).orElse(null);
	}

	@Override
	public void subscribeBookById(Integer id) {
		Book existBook = bookRepo.findById(id).orElseThrow(() -> new com.book.exception.BookNotFoundExceptionHandler("Book", "id", id));
		Boolean status = existBook.isActive();
		System.out.println(status);
		if (status) {
			status = false;
		} else {
			status = true;
		}
		System.out.println(status);
		existBook.setActive(status);
		bookRepo.save(existBook);

	}

	

	


	
}
