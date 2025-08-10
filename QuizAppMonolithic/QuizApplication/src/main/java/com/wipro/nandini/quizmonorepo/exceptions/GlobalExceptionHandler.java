package com.wipro.nandini.quizmonorepo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
	public ResponseEntity<ErrorMessage> handleQuestionNotFound(QUESTION_NOT_FOUND_EXCEPTION ex){
		ErrorMessage err=new ErrorMessage(ex.getMessage(),"QUESTION_NOT_FOUND_EXCEPTION");
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
		
	}
	
	
	

}
