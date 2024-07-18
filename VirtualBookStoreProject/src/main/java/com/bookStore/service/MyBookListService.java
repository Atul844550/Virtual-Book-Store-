package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service // Indicates that this class is a service component in Spring
public class MyBookListService {
	
	@Autowired
	private MyBookRepository mybook; // Injects the MyBookRepository to interact with the database
	
	// Saves a MyBookList entry to the repository
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
	
	// Retrieves a list of all MyBookList entries from the repository
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll();
	}
	
	// Deletes a MyBookList entry by its ID from the repository
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}
