package com.hg.book_mybatis.dto;

import lombok.Data;

@Data
public class BookAddRequest {
	private String name;
	private String author;
	private String price;
}
