package com.hg.book_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hg.book_mybatis.service.MyBookService;

@Controller
public class MyBookController {

	@Autowired
	private MyBookService myBookService;
	
}
