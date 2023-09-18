package com.hg.book_mybatis.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BookAddRequest {
	@NotEmpty(message = "名前を入力してください")
	@Size(max = 100, message = "本名は100桁以内で入力してください")
	private String name;
	@Size(max = 100, message = "作者は100桁以内で入力してください")
	private String author;
	@Pattern(regexp = "^[0-9]*",message = "金額は数（０－９）を入力してください")
	private String price;
}
