package com.hg.book_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.book_mybatis.dto.BookAddRequest;
import com.hg.book_mybatis.repository.BookMapper;

@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	
	public void save(BookAddRequest bookAddRequest) {
		bookMapper.save(bookAddRequest);
	}
}
