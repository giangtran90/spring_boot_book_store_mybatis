package com.hg.book_mybatis.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BookUpdateRequest extends BookAddRequest{

	@NotNull
	private Long id;
}
