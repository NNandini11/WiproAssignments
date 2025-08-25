package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice

public class GlobalExceptionHandler {
	 @ExceptionHandler(USER_NOT_FOUND_EXCEPTION.class)
	public ResponseEntity<ErrorMessage> handleUserNotFoundException(USER_NOT_FOUND_EXCEPTION ex){
		ErrorMessage errormessage=new ErrorMessage(ex.getMessage(),"USER_NOT_FOUND_EXCEPTION");
		return new ResponseEntity<>(errormessage,HttpStatus.NOT_FOUND);
	}

}
