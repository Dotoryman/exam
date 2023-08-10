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
	//��ü��ȸ
	@GetMapping("/list") // �̷��� �̸� ������ String�� void�� �ٲٰ� ��������� �ϸ� �ȴ�
	public void list(Model model) { 
		model.addAttribute("list", service.getList());
	}

	
	//���
	@PostMapping("/register")
	public void register(BookVO vo) {
		service.regist(vo);
	}
	
	
}
