package com.library.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.entity.Book;
import com.library.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book createBook(Book newBook) {
		return bookRepo.save(newBook);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepo.findById(id).orElse(null);
	}

	@Override
	public Book updateBook(Long id, Book updateBook) {
	Book existBook = bookRepo.findById(id).orElseThrow(() -> new com.library.exception.ResourceNotFoundExceptionHandler("Book", "id", id));
	existBook.setBookName(updateBook.getBookName());
	existBook.setAuthorName(updateBook.getAuthorName());
	existBook.setPrice(updateBook.getPrice());
	existBook.setGenre(updateBook.getGenre());
	existBook.setBorrowed(updateBook.getBorrowed());
		return bookRepo.save(existBook);
	}

	@Override
	public void changeBookStatus(Long id, Boolean isBorrowed) {
		bookRepo.updateBorrowedById(isBorrowed, id);
	}
	
	@Override
	public void changeBookStatus2(Long id) {
		Book existBook = bookRepo.findById(id).orElseThrow(() -> new com.library.exception.ResourceNotFoundExceptionHandler("Book", "id", id));
		Boolean status = existBook.getBorrowed();
		System.out.println(status);
		if (status) {
			status = false;
		} else {
			status = true;
		}
		System.out.println(status);
		existBook.setBorrowed(status);
		bookRepo.save(existBook);

	}


	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}
