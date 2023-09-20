package com.hg.book_mybatis.entity;

import java.util.Date;

import lombok.Data;

@Data
public class MyBookEntity {
	private Long id;
	private String name;
	private String author;
	private String price;
	private Date createDate;
	private Date deleteDate;
}
