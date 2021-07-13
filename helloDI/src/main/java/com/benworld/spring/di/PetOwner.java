package com.benworld.spring.di;

public class PetOwner {
	
	// Pet 주인이 소유한 동물 
	private AnimalType animal;

	public PetOwner(AnimalType animal) {
		super();
		this.animal = animal;
	}
	
	public void play() {
		animal.sound();
	}
}
