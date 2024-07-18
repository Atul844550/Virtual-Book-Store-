package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Indicates that this class is a JPA entity and is mapped to a database table
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; // Primary key, auto-generated by the database
	private String name; // Name of the book
	private String author; // Author of the book
	private String price; // Price of the book
	
	// Constructor with parameters, used for creating a new Book object with specific values
	public Book(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	// Default constructor, required by JPA
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getter method for id
	public int getId() {
		return id;
	}
	
	// Setter method for id
	public void setId(int id) {
		this.id = id;
	}
	
	// Getter method for name
	public String getName() {
		return name;
	}
	
	// Setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter method for author
	public String getAuthor() {
		return author;
	}
	
	// Setter method for author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// Getter method for price
	public String getPrice() {
		return price;
	}
	
	// Setter method for price
	public void setPrice(String price) {
		this.price = price;
	}
	
}
