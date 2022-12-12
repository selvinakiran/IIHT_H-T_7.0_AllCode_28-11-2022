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
		// TODO Auto-generated method stub
		return bookRepo.findById(id).orElse(null);
	}

	

	


	
}
