package com.example.demo.controller;

import org.springframework.core.codec.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub6")
public class Controller06 {
	
	@RequestMapping("link1")
	public String method1() {
		System.out.println("link1 메소드 일함");
		
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println("link2 메소드 일함");
	}
	
	// 경로 : /sub6/link3
	// method3 작성
	// forward /sub6/link2
	@RequestMapping("link3")
	public String method3() {
		System.out.println("link3 메소드 일함");
		
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link4")
	public void method4(HttpServletRequest req, HttpServletResponse res) throws Exception{
		
		System.out.println("link4 에서 일함");
		
		String view = "/WEB-INF/views/abc.jsp";
		req.getRequestDispatcher(view).forward(req, res);
	}
	
	@RequestMapping("link5")
	public String method5() {
		System.out.println("link5 에서 일함");
		
		return "forward:/WEB-INF/views/abc.jsp";
	}
	
	@RequestMapping("link6")
	public String method6() {
		System.out.println("link6 에서 일함");
		
		return "abc";
	}
	
	@RequestMapping("link7")
	public String method7() {
		System.out.println("link7 에서 일함");
		
		return "def";
	}
	
	@RequestMapping("link8")
	public String method8() {
		System.out.println("8번 메소드 일함");
		// default view name : /sub6/link8
		return "/sub6/link8";
	}
	
	@RequestMapping("link9")
	public void method9() {
		System.out.println("9번 메소드 일함");
		// default view name : /sub6/link9
	}
	
	@RequestMapping("link10")
	public String method10() {
		System.out.println("10번 메소드 일함");
		
		return null; // forward default view name
	}
	
	@RequestMapping("link11")
	public void method11() {
		System.out.println("11번 메소드 일함");
	}
	
	@RequestMapping("link12")
	public void method12(String name, int age) {
	}
	
	
	
	
	
}
