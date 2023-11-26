package com.hg.book_mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hg.book_mybatis.dto.MyBookAddRequest;
import com.hg.book_mybatis.entity.MyBookEntity;

@Mapper
public interface MyBookMapper {

	void addMyBook(MyBookAddRequest myBookAddRequest);

	List<MyBookEntity> fetchAllMyBooks();
	
	
}
