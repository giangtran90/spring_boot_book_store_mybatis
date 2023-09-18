package com.hg.book_mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hg.book_mybatis.dto.BookAddRequest;
import com.hg.book_mybatis.dto.BookUpdateRequest;
import com.hg.book_mybatis.entity.BookEntity;

@Mapper
public interface BookMapper {

	void save(BookAddRequest bookAddRequest);

	List<BookEntity> fetchAllBooks();

	List<BookEntity> fetchBooksByNameOrAuthor(String keyword);

	BookEntity findBookById(Long id);

	void updateBook(BookUpdateRequest bookUpdateRequest);
}
