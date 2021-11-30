package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
public class AutoScanController {

	@Autowired
	private MemberVO memberVO;
	
	
	//RequestMapping jsp파일과 연동
	@RequestMapping("autoScan.do")
	public ModelAndView xxx() {
		ModelAndView mv = new ModelAndView();
		//mv.setViewName(viewName);
		mv.addObject("mVO", memberVO);
		
		return mv;
	}
}
