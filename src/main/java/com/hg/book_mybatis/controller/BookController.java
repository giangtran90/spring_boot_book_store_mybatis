package com.hg.book_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hg.book_mybatis.dto.BookAddRequest;
import com.hg.book_mybatis.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
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
	public String saveBook(@Validated @ModelAttribute BookAddRequest bookAddRequest, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "books/bookRegister";
		}
		bookService.save(bookAddRequest);
		return "redirect:/available_books";
	}
}
