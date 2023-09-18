package com.hg.book_mybatis.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BookEntity {

	private Long id;
	private String name;
	private String author;
	private String price;
	private Date createDate;
	private Date updateDate;
	private Date deleteDate;
}
