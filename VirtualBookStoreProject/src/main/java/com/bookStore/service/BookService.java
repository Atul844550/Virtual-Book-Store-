package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service // Indicates that this class is a service component in Spring
public class BookService {
	
	@Autowired
	private BookRepository bRepo; // Injects the BookRepository to interact with the database
	
	// Saves a book to the repository
	public void save(Book b) {
		bRepo.save(b);
	}
	
	// Retrieves a list of all books from the repository
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	// Retrieves a book by its ID from the repository
	public Book getBookById(int id) {
		return bRepo.findById(id).get();
	}
	
	// Deletes a book by its ID from the repository
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}

	
}
