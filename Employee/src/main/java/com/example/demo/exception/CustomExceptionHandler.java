package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public final ResponseEntity<Object> userNotFoundExceptions(EmployeeNotFoundException ex, WebRequest request)
	{
		HandleException handler = new HandleException(new Date(), ex.getMessage(), request.getDescription(false));
		
		return new ResponseEntity<Object>(handler, HttpStatus.NOT_FOUND);
	}
	

}
