package com.yedam.exam.dept;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.exam.dept.mapper.DeptMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/*-context.xml")
@Log4j
public class DeptMapperTest {
	@Setter(onMethod_ = @Autowired)
	private DeptMapper mapper;
	
	@Test
	public void getList() {
		log.info(mapper.getList());
	}
}
