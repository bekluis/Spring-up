package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;
import com.javaclass.model.MemberVOList;

@Controller
public class UserListController {
	//UserListProperty와 연결 
	@RequestMapping("multiInsert.do")
	public String test(MemberVOList memberVOList) {
		for(MemberVO m : memberVOList.getList()) {
			System.out.println(m.isState() + ">" + 
					m.getId() + ":" + m.getName());
		}
		return "userListResult";
		//userListResult라는 뷰페이지 지정
		//// WEB-INF/views + userListResult + .jsp 가 불려질 것
	}
}
