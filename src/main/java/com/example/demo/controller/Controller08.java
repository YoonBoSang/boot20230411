package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;


@Controller
@RequestMapping("sub8")
public class Controller08 {

	@RequestMapping("link1")
	public String method1(@ModelAttribute("val") Dto04 dto04) {
		dto04.setName("nami");
		dto04.setAge(22);
		
		return "/sub7/link10";
	}
	
	@RequestMapping("link2")
	public void method2(@ModelAttribute("product") Dto02 obj) {
		obj.setCompany("apple");
		obj.setModel("ipad");
		obj.setPrice(300);
	}
	
	@RequestMapping("link3")
	public void method3(Model model) {
		Dto02 dto02 = new Dto02();
		Dto03 dto03 = new Dto03();
		model.addAttribute("product", dto02);
		model.addAttribute("member", dto03);
	}
	@RequestMapping("link4")
	public void method4(@ModelAttribute("dto02") Dto02 dto02,
						@ModelAttribute("dto03") Dto03 dto03) {
		// 3. add attribute
		// 4. forward
	}
	
	// model attribute의 이름을 생략하면 클래스 이름을 lowerCamelCase로 바꾼것으로 결정
	
	// 예) CompanyMember -> companyMember
	@RequestMapping("link5")
	public void method5(@ModelAttribute("dto02") Dto02 dto02,
			@ModelAttribute("dto03") Dto03 dto03) {
		// 3. add attribute
		dto02.setModel("microsoft");
		dto03.setName("bill gates");
		// 4. forward
	}
	
	@RequestMapping("link6")
	public void method6(@ModelAttribute Dto02 dto02,
						@ModelAttribute Dto03 dto03) {
		// 3. add attribute
		dto02.setModel("microsoft");
		dto03.setName("bill gates");
		// 4. forward
	}
	
}
