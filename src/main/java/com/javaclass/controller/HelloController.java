package com.javaclass.controller;


import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("start.do")
	public ModelAndView start(){
		System.out.println("start.do 요청받음");
		// 이 다음의 뷰페이지를 클라이언트에게 보내는데
		// 자동으로/WEB-INF/views + start + .jsp
		
		ModelAndView mv = new ModelAndView();
		// view에서 home.jsp로 간다
		mv.setViewName("home");// /WEB-INF/views + start + .jsp
		mv.addObject("serverTime", new Date());
		mv.addObject("userid","Beckham");
		mv.addObject("userpassword","B723");
		mv.addObject("address", new Random());
		mv.addObject("message","오늘도 행복하게 지냅");
		
		
		
		
		return mv;
	}
}
