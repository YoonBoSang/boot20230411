package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub7")
public class Controller07 {
	
	@RequestMapping("link1")
	public void method1(HttpServletRequest req) {
		// 1.
		// 2.
		// 3. add attribute
		req.setAttribute("myName", "서태웅");
		
	}
	
	@RequestMapping("link2")
	public String method2(Model model) {
		
		model.addAttribute("myName", "채치수");
		
		return "/sub7/link1";
	}
	
	@RequestMapping("link3")
	public String method3(Model model) {
		
		model.addAttribute("address", "seoul");
		
		return "/sub7/link3";
	}
	
	@RequestMapping("link4")
	public void method4(Model model) {
		
		model.addAttribute("list", List.of("java", "spring"));
	}
	
	@RequestMapping("link5")
	public void method5(Model model) {
		
		model.addAttribute("myMap", Map.of("address", "incheon", "age", "24", "email", "asdf@naver.com"));
	}
	
	@RequestMapping("link6")
	public void method6(Model model) {
		model.addAttribute("name", "이한나");
		model.addAttribute("job", "매니저");
		model.addAttribute("hobby", List.of("영화", "독서", "TV"));
	}
	
	@RequestMapping("link7")
	public void method7(Model model) {
		model.addAttribute("age", "24");
		model.addAttribute("country", "korea");
		model.addAttribute("movieList", List.of("iron man", "avatar", "batman"));
		
	}
	
	@RequestMapping("link8")
	public void method8(Model model) {
		Dto01 o1 = new Dto01();
		o1.setName("박지성");
		o1.setAge(40);
		
		model.addAttribute("player", o1);
	}
	
	@RequestMapping("link9")
	public void method9(Model model) {
		Dto02 o1 = new Dto02();
		o1.setCompany("samsung");
		o1.setModel("s23+");
		o1.setPrice(2000000);
		
		model.addAttribute("value", o1);
	}
	
	@RequestMapping("link10")
	public void method10(Model model) {
		Dto04 obj = new Dto04();
		
		obj.setAge(26);
		obj.setName("김루인");
		
		model.addAttribute("val", obj);
		
		
	}
	
}
