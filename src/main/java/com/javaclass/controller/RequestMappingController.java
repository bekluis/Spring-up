package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.model.MemberVO;

@Controller

//class에도 Mapping을 해줄 수 있다
@RequestMapping("re")
public class RequestMappingController {

	//value= 써도 되고 안써도 됨,여러 개 쓰고 싶으면 {,} 사용
	//class에서 RequestMapping으로 "re"를 써주어서 re/부분을 빼줌.12행
	@RequestMapping(value={"a.do","b.do"})
	//리턴되는 값이 String
	public String test(){
		System.out.println("a.do와 b.do 요청");
		return "start";
		// start라는 뷰페이지 지정
		// WEB-INF/views + start + .jsp 가 불려질 것
	}
	//***************************
	// SpringMVC에서 리턴값이 String인 경우는 무조건 뷰페이지명을 지정하는 것임,
	
	
	//주소창의 단계지정
	//파라메터만 있을 때만 mapping 매핑 조건에 맞춰서 매핑하게끔 요청3만  
	@RequestMapping(value="c.do", params={"id=kim"})
	//void일때 자동으로 뷰페이지 찾기
	public void test2(){
		System.out.println("c.do와 파라메터 요청 필");
	}
	
	
	//void일때 자동으로 뷰페이지 찾기
	//변수명을 vo로 쓰고 싶을땐 @ModelAttribute사용 잘 사용하지 않는다
//	@RequestMapping(value="request.do", method=RequestMethod.POST)
//	public void test3(){
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		
//		MemberVO vo = new MemberVO();
//		vo.setId(id);
//		vo.setName(name);
//		vo.setAge(age);
		

	
	//void일때 자동으로 뷰페이지 찾기
	@RequestMapping(value="request.do", method=RequestMethod.POST)
	//변수명을 vo로 쓰고 싶을땐 @ModelAttribute사용 잘 사용하지 않는다
	public void test3(MemberVO vo){
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		int age = Integer.parseInt(request.getParameter("age"));
//		
//		MemberVO vo = new MemberVO();
//		vo.setId(id);
//		vo.setName(name);
//		vo.setAge(age);
		System.out.println("이름:" + vo.getName());
	}
}
