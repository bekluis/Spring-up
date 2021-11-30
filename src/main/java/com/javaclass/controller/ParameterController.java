package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
public class ParameterController {
	
	@RequestMapping("paramForm.do")
	//***************************** 세션을 사용시 인자로 HttpSession session 선언
	public String paramForm(MemberVO vo, HttpSession session) {
		// 추후에 디비에 저장된 값
		String dbid = "002";
		String dbname = "홍길동";
		
		// 로그인 성공(dbid.equals()) && dbname.equals())) set,getAttribute 로그아웃시 invalidate
		if(dbid.equals(vo.getId()) && dbname.equals(vo.getName())){
			session.setAttribute("login",vo.getName());
			session.setAttribute("hello", "안녕");
			return "paramForm";
		}else {//로그인 실패
			return "sample";
		}
	}
	
	
	//요청 2개 value={,} 써주기
	@RequestMapping(value={"param.do"})
	public String test(MemberVO vo, Model m) {
		System.out.println("화면에서 넘어온 값 : " + vo.getId());
		System.out.println("화면에서 넘어온 값 : " + vo.getAge());
		System.out.println("화면에서 넘어온 값 : " + vo.getName());
		m.addAttribute("message", "오늘도 행복합시다");
		//Model은 message를 paraResult 뷰페이지로 넘겨준다.
		//java에서와 spring과의 차이
		return "paramResult";
		//jsp 파일이 어디있어야 할까 view밑에
	}
	
	/*
	 * 서버(컨트롤러)에서 클라이언트(뷰)에 데이타 전송 방식
	 * 
	 * 1. ModelAndView에 데이타를 추가하여 리턴
	 * 
	 * 2. 리턴을 하지 못하는 경우 : void, String리턴(뷰페이지 지정)
	 * 		====> Model 이용 (위치가 중요******)
	 */
	
	
//	@RequestMapping("param.do")
//	public String test(String id, 
//			@RequestParam(defaultValue="0") int age) {
//		System.out.println("화면에서 넘어온 값 : " + id);
//		System.out.println("화면에서 넘어온 값 : " + age);
//		return "paraResult";
//  함수 안에(String int 하나하나씩 넣어주던가 아님 MemberVO의 멤버변수를 맞춰놓으면 MemberVO vo만 써주어도 됨.
}
