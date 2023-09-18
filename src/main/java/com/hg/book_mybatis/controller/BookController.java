package com.hg.book_mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hg.book_mybatis.dto.BookAddRequest;
import com.hg.book_mybatis.dto.BookUpdateRequest;
import com.hg.book_mybatis.entity.BookEntity;
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
	public String displayAvailableBooks(Model model) {
		List<BookEntity> bookEntities = bookService.fetchAllBooks();
		model.addAttribute("books", bookEntities);
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
	
	@GetMapping("/search")
	public String fetchBooksByNameOrAuthor(@RequestParam("keyword") String keyword, Model model) {
		List<BookEntity> bookEntities = bookService.fetchBooksByNameOrAuthor(keyword);
		model.addAttribute("books", bookEntities);
		return "books/bookList";
	}
	
	@GetMapping("/edit_book/{id}")
	public String findBookById(@PathVariable("id") Long id, Model model) {
		BookEntity bookEntity = bookService.findBookById(id);
		model.addAttribute("book", bookEntity);
		return "books/bookEdit";
	}
	
	@RequestMapping("/update")
	public String updateBook(@Validated @ModelAttribute BookUpdateRequest bookUpdateRequest, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			BookEntity bookEntity = bookService.findBookById(bookUpdateRequest.getId());
			model.addAttribute("book", bookEntity);
			return "books/bookEdit";
		}
		bookService.updateBook(bookUpdateRequest);
		return "redirect:/available_books";
	}
}
