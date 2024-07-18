package com.bookStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Indicates that this class is a JPA entity and is mapped to a database table
@Table(name="MyBooks") // Specifies the table name in the database
public class MyBookList {
	
	@Id // Specifies the primary key of the entity
	private int id; // ID of the book in the user's list
	private String name; // Name of the book
	private String author; // Author of the book
	private String price; // Price of the book
	
	// Default constructor, required by JPA
	public MyBookList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor with parameters, used for creating a new MyBookList object with specific values
	public MyBookList(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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
