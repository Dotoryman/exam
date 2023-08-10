package com.yedam.exam.book.mapper;

import java.util.List;

import com.yedam.exam.domain.BookVO;


public interface BookMapper {
	public List<BookVO> getList();
	public void insert(BookVO vo);
}
