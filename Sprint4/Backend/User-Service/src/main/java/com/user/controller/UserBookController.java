package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.models.Book;
import com.user.models.BookFilter;
import com.user.models.SubscribeDetails;

@RestController
@RequestMapping("/api/v1/digitalbooks")
@CrossOrigin("http://localhost:4200")
public class UserBookController {

	@Autowired
	private RestTemplate restTemplate;

	
	@PostMapping("/author/book/add")
	public ResponseEntity<?> addBook(@RequestBody Book book) {
		Book result = restTemplate.postForObject("http://BOOK-SERVICE/add", book, Book.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PutMapping("/author/update/{book-id}")
	public ResponseEntity<?> updateBook(@PathVariable("book-id") Long id, @RequestBody Book updateBook) {
		HttpEntity<Book> entity = new HttpEntity<Book>(updateBook);
		ResponseEntity<?> result = restTemplate.exchange("http://BOOK-SERVICE/update/" + id, HttpMethod.PUT, entity,
				Book.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PutMapping("/author/blk-unblk/{book-id}")
	public ResponseEntity<?> updateBorrowed(@PathVariable("book-id") Long id, @RequestBody Boolean isActive) {
		HttpEntity<Boolean> entity = new HttpEntity<Boolean>(isActive);
		ResponseEntity<?> result = restTemplate.exchange("http://BOOK-SERVICE/blk-unblk/" + id, HttpMethod.PUT,
				entity, String.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<?> searchBooks(@RequestBody BookFilter filter) {
		List<?> result = restTemplate.postForObject("http://BOOK-SERVICE/search", filter, List.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}


	@PutMapping("/reader/subscribe/{book-id}")
	public ResponseEntity<?> subcribeBook(@PathVariable("book-id") Long bookId,
			@RequestBody SubscribeDetails subDetails) {
		HttpEntity<SubscribeDetails> entity = new HttpEntity<SubscribeDetails>(subDetails);
		ResponseEntity<?> result = restTemplate.exchange("http://BOOK-SERVICE/subscribe/" + bookId,
				HttpMethod.PUT, entity, Long.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PutMapping("/reader/cancel-subscription/{sub-id}")
	public ResponseEntity<?> unsubcribeBook(@PathVariable("sub-id") Long subId,
			@RequestBody SubscribeDetails subDetails) {
		HttpEntity<SubscribeDetails> entity = new HttpEntity<SubscribeDetails>(subDetails);
		ResponseEntity<?> result = restTemplate.exchange("http://BOOK-SERVICE/cancel-subscription/" + subId,
				HttpMethod.PUT, entity, String.class);
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	@GetMapping("/reader/getalluser/{subName}")
	public ResponseEntity<?> getAllByUser(@RequestParam String subName) {
		List<?> result = restTemplate.getForObject("http://BOOK-SERVICE/getalluser/" + subName, List.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/reader/get/{subId}/by-user/{subName}")
	public ResponseEntity<?> getBookByUserAndSubId(@RequestParam String subName, @RequestParam Long subId) {
		List<?> result = restTemplate.getForObject("http://BOOK-SERVICE/get/" + subId + "/by-user/" + subName,
				List.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}