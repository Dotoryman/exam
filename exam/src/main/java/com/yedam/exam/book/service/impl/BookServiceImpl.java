package com.yedam.exam.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.exam.book.mapper.BookMapper;
import com.yedam.exam.book.service.BookService;
import com.yedam.exam.domain.BookVO;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class BookServiceImpl implements BookService{

	@Setter(onMethod_=@Autowired)
	private BookMapper mapper;
	
	@Override
	public void regist(BookVO vo) {
		mapper.insert(vo); 
	}

	@Override
	public List<BookVO> getList() {
		return mapper.getList();
	}

}
