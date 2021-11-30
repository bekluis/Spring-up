package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//(2) 해당 요청을 받아서 뷰페이지 지정  : 컨트롤러단

@Controller
public class SampleController {
	
	
	
	//jsp파일이 요청하면 나 받을 꺼야, 이름 맞추기
	@RequestMapping("sample.do")
	public void sample(Model m) {
		m.addAttribute("data","확인");
	}
	
	/**
	 * **** 컨트롤러에서 뷰페이지 데이터 전송시
	   1) ModelAndView 생성하여 리턴(프로젝트때 결정할 것)
	   2) Model 사용 (함수 인자로 기술)
	  
	 */
	
	
	/*
	 * ******** 리턴형
	 	1) ModelAndview : 뷰페이지 지정과 데이터  전달시
	 	2) String : 뷰페이지 지정
	 	3) void : 요청명과 동일한 뷰페이지로 자동 지정 //view 밑에 있는 jsp파일이 불려진다.(sample.do로 mapping시 void를 쓸 경우)
	 */
}
