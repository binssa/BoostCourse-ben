package com.benworld.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Offer {
	
	
	private int id;
	
	// @Valid에서 검증 시 사용할 조건 설정 
	@Size(min=2, max=100, message="Name must 2~100 character")
	private String name;
	@Email(message="Please provide a valid email address")
	@NotEmpty(message="The Email address cannot be empty")
	private String email;
	@Size(min=5, max=100, message="Name must 5~100 character")
	private String text;
	
	public Offer() {
		
	}
	
	// ID : Auto Increment
	public Offer(String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
}
