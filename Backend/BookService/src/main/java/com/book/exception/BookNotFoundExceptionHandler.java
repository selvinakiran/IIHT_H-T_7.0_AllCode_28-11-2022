package com.book.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BookNotFoundExceptionHandler extends RuntimeException {

	private String entity;
	private String fieldName;
	private String fieldValue;

	public BookNotFoundExceptionHandler(String entity, String fieldName, String fieldValue) {
		super(String.format("%s with %s : %s was not found", entity, fieldName, fieldValue));
		this.entity = entity;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
