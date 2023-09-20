package com.hg.book_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.book_mybatis.dto.MyBookAddRequest;
import com.hg.book_mybatis.repository.MyBookMapper;

@Service
public class MyBookService {
	
	@Autowired
	private MyBookMapper myBookMapper;

	public void addMyBook(MyBookAddRequest myBookAddRequest) {
		// TODO Auto-generated method stub
		myBookMapper.addMyBook(myBookAddRequest);
	}

}
