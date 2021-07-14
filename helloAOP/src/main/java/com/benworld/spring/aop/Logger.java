package com.benworld.spring.aop;

public class Logger {
	
	//advice
	public void aboutToSound() {
		// aspect 
		System.out.println("before: about to sound");
	}
}
