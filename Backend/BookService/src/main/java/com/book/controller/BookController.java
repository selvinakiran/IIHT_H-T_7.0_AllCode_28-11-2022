package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.IBookService;




@RestController
@RequestMapping("/api/v1/digitalbooks")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@GetMapping("/allbooks")
	public ResponseEntity<List<Book>> getAllBooks() {
		return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
	}
	
	@PostMapping("/sign-up")
	public ResponseEntity<?> createBook(@RequestBody Book book) {
		return new ResponseEntity<>(bookService.createBook(book), HttpStatus.OK);
	}
	
	
	@PostMapping("/sign-in/{id}") 
	public ResponseEntity<?> getBookById(@PathVariable("id") Integer id,@RequestBody Book books) {
		Book book = bookService.getLoginById(id);
		if (book == null) {
			return new ResponseEntity<>("No such Login available !", HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(bookService.getLoginById(id), HttpStatus.OK);
		}
	}
	
	@PostMapping("/{id}/subscribe") 
	public ResponseEntity<?> subscribeBookById(@PathVariable("id") Integer id,@RequestBody Book books) {
		Book book = bookService.getLoginById(id);
		if (book == null) {
			return new ResponseEntity<>("No such Subscrition available !", HttpStatus.NOT_FOUND);
		} else {
		
			bookService.subscribeBookById(id);
			return new ResponseEntity<>("Book Subscrition updated successfully !", HttpStatus.OK);
		}
	}
	
	
}
