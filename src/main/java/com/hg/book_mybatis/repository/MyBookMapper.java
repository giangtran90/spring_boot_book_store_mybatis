package com.hg.book_mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hg.book_mybatis.dto.MyBookAddRequest;

@Mapper
public interface MyBookMapper {

	void addMyBook(MyBookAddRequest myBookAddRequest);

}
