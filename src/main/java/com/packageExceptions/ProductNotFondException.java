package com.packageExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ProductNotFondException extends RuntimeException {
	   
	   @ExceptionHandler(value = ProductNotFondException.class)
		public ResponseEntity<Object> exception(ProductNotFondException exception) {
			return new ResponseEntity<Object>("Page not found",HttpStatus.OK);
		}

}
