package com.benworld.spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	// Pet 주인이 소유한 동물 
	@Autowired //Wiring by Type
	@Qualifier(value="qf_cat") //AnimalType이 Dog, Cat 2가지여서 명시해줘야함.
//	@Resource // Wiring by Name
	private AnimalType animal;
	
	// Use XML
//	public PetOwner(AnimalType animal) {
//		super();
//		this.animal = animal;
//	}
	
	public void play() {
		animal.sound();
	}
}
