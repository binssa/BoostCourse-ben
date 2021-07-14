package com.benworld.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	//advice
	@Pointcut("execution(void com.benworld.spring.aop.*.sound())") //Expression
	private void selectSound() { //Signature of Pointcut 	
	}
	
	@Before("selectSound()")
	public void aboutToSound() {
		// aspect 
		System.out.println("before: about to sound");
	}
}
