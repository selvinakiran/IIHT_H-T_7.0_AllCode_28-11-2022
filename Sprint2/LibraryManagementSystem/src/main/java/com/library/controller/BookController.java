package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.library.entity.Book;
import com.library.services.IBookService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService bookService;


	@PostMapping("/addbook")
	public ResponseEntity<?> createBook(@RequestBody Book book) {
		return new ResponseEntity<>(bookService.createBook(book), HttpStatus.OK);
	}

	@GetMapping("/allbooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}

	@GetMapping("/read/{id}")
	public ResponseEntity<?> getBookById(@PathVariable("id") Long id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No such book available !", HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateBook(@PathVariable("id") Long id, @RequestBody Book updateBook) {
		return new ResponseEntity<>(bookService.updateBook(id, updateBook), HttpStatus.OK);
	}

	@PutMapping("/borrow/{id}")
	public ResponseEntity<?> updateBorrowed(@PathVariable("id") Long id, @RequestBody Boolean isBorrow) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No such book available !", HttpStatus.NOT_FOUND);
		} else {
			bookService.changeBookStatus(id, isBorrow);
			return new ResponseEntity<>("Book status updated successfully !", HttpStatus.OK);
		}
	}
	
	//Sample for borrow status
	//	@PutMapping("/borrow1/{id}")
	//	public void changeStatus(@PathVariable Long id) {
	//		bookService.changeBookStatus2(id);
	//	}
		
	
	@PutMapping("/borrow2/{id}")
	public ResponseEntity<?> BorrowedStatus(@PathVariable("id") Long id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No such book available !", HttpStatus.NOT_FOUND);
		} else {
			bookService.changeBookStatus2(id);
			return new ResponseEntity<>("Book status updated successfully !", HttpStatus.OK);
		}
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> deleteBook(@PathVariable("id") Long id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No such book available !", HttpStatus.NOT_FOUND);
		} else {
			bookService.deleteBook(id);
			return new ResponseEntity<>("Book deleted successfully !", HttpStatus.OK);
		}
	}
	
	

}
