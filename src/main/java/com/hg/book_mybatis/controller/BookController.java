package com.hg.book_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hg.book_mybatis.entity.BookEntity;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayHome() {
		return "home";
	}
	
	@GetMapping("/available_books")
	public String displayAvailableBooks() {
		return "books/bookList";
	}
	
	@GetMapping("/book_register")
	public String displayBookRegister() {
		return "books/bookRegister";
	}
	
	@PostMapping("/save")
	public String saveBook(@ModelAttribute BookEntity bookEntity) {
		
		return "redirect:/available_books";
	}
}
