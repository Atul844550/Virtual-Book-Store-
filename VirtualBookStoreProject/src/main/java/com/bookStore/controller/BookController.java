package com.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.entity.Book;
import com.bookStore.entity.MyBookList;
import com.bookStore.service.BookService;
import com.bookStore.service.MyBookListService;


import java.util.*;

@Controller
public class BookController {
	
	@Autowired
	private BookService service; // Injects the BookService for handling book-related operations
	
	@Autowired
	private MyBookListService myBookService; // Injects the MyBookListService for handling the user's book list operations
	
	@GetMapping("/home")
	public String home() {
		return "home"; // Maps the "/home" URL to return the "home" view (home.html)
	}
	
	
	@GetMapping("/book_register")
	public String bookRegister(Model model) {
		model.addAttribute("book", new Book()); // Add an empty Book object to the model
		return "bookRegister"; // Maps the "/book_register" URL to return the "bookRegister" view (bookRegister.html)
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBook() {
		List<Book> list = service.getAllBook(); // Retrieves a list of all books from the service
		return new ModelAndView("bookList", "book", list); // Returns the "bookList" view (bookList.html) with the list of books
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b); // Saves a new book using the service
		return "redirect:/available_books"; // Redirects to the "/available_books" URL after saving the book
	}
	
	@GetMapping("/my_books")
	public String getMyBooks(Model model) {
		List<MyBookList> list = myBookService.getAllMyBooks(); // Retrieves the user's list of books from the service
		model.addAttribute("book", list); // Adds the list to the model
		return "myBooks"; // Returns the "myBooks" view (myBooks.html)
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b = service.getBookById(id); // Retrieves a book by its ID
		MyBookList mb = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice()); // Creates a new MyBookList entry from the book
		myBookService.saveMyBooks(mb); // Saves the new entry to the user's book list
		return "redirect:/my_books"; // Redirects to the "/my_books" URL after adding the book to the list
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		Book b = service.getBookById(id); // Retrieves a book by its ID for editing
		model.addAttribute("book", b); // Adds the book to the model
		return "bookEdit"; // Returns the "bookEdit" view (bookEdit.html) for editing the book
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		service.deleteById(id); // Deletes a book by its ID using the service
		return "redirect:/available_books"; // Redirects to the "/available_books" URL after deleting the book
	}
	
	
	
	
	
}










	

