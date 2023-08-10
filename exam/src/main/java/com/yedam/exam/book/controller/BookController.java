package com.yedam.exam.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.exam.book.service.BookService;
import com.yedam.exam.domain.BookVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/book/*")
@AllArgsConstructor
@Log4j
public class BookController {

	private BookService service;
	//전체조회
	@GetMapping("/list") // 이렇게 이름 같으면 String을 void로 바꾸고 리턴지우고 하면 된다
	public void list(Model model) { 
		model.addAttribute("list", service.getList());
	}

	
	//등록
	@PostMapping("/register")
	public void register(BookVO vo) {
		service.regist(vo);
	}
	
	
}
