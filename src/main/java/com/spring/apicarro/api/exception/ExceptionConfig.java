package com.spring.apicarro.api.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionConfig extends ResponseEntityExceptionHandler {

	@SuppressWarnings("rawtypes")
	@ExceptionHandler({ EmptyResultDataAccessException.class })
	public ResponseEntity errorNotFound() {
		return ResponseEntity.notFound().build();
	}

	@SuppressWarnings("rawtypes")
	@ExceptionHandler({ IllegalArgumentException.class })
	public ResponseEntity errorBadRequest() {
		return ResponseEntity.badRequest().build();
	}

	@SuppressWarnings("rawtypes")
	@ExceptionHandler({ AccessDeniedException.class })
	public ResponseEntity accessDenied() {
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new Error("Acesso negado"));
	}
}

class Error {
	public String error;

	public Error(String error) {
		this.error = error;
	}
}