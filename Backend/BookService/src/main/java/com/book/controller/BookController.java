package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}
