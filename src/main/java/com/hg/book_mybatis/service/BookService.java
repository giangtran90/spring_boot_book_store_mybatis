package com.hg.book_mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.book_mybatis.dto.BookAddRequest;
import com.hg.book_mybatis.entity.BookEntity;
import com.hg.book_mybatis.repository.BookMapper;

@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	
	public void save(BookAddRequest bookAddRequest) {
		bookMapper.save(bookAddRequest);
	}

	public List<BookEntity> fetchAllBooks() {
		// TODO Auto-generated method stub
		return bookMapper.fetchAllBooks();
	}

	public List<BookEntity> fetchBooksByNameOrAuthor(String keyword) {
		// TODO Auto-generated method stub
		return bookMapper.fetchBooksByNameOrAuthor(keyword);
	}

	public BookEntity findBookById(Long id) {
		// TODO Auto-generated method stub
		return bookMapper.findBookById(id);
	}
}
