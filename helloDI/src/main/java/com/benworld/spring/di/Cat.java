package com.benworld.spring.di;

public class Cat implements AnimalType {
	
	private String myName;
	
	@Override
	public void sound() {
		System.out.println("Cat Name : " + myName + " : " + "Meow!");
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
}
