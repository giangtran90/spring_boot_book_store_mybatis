package com.hg.book_mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hg.book_mybatis.dto.BookAddRequest;

@Mapper
public interface BookMapper {

	void save(BookAddRequest bookAddRequest);
}
