package com.yedam.exam.book.service;

import java.util.List;

import com.yedam.exam.domain.BookVO;


public interface BookService {
	public void regist (BookVO vo);
	public List<BookVO> getList();
}
