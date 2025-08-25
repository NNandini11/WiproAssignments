package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Aspect //Extra logic
@Component // spring will take care to create bean of this class

public class LoggingAspect {
	
	// This method is called advice
	@Before("execution(* com.example.demo.controller.UserController.addingIntoService(..))")
	public void logbefore() {
		
		
		
	}

}
