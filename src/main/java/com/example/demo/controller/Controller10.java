package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub10")
public class Controller10 {
	
	@RequestMapping("link1")
	public void method01(@RequestParam String name) {
//		String name = request.getParameter("name")
	}
	
	@RequestMapping("link2")
	public void method02(@ModelAttribute Dto04 dto) {
//		Dto04 dto = new Dto04();
//		dto.setName(request.getParameter("name"));
//		e5o.setAge(Integer.parseInt(request.getParameter("age")));
//		
//		request.setAttribute("dto04", dto);
	}
	
	@RequestMapping("link3")
	public void method03(String model,
						 double price,
						 Dto04 obj ) {
//		mod.addAttribute("model", model);
//		mod.addAttribute("price", price);
	}
	
	@RequestMapping("link4")
	public void method4() {
		// 1. request param 수집/가공
		
		// 2. business logic
		// data를 생성(create), 읽기(read), 수정(update), 삭제(delete)
		// crud
		
		// 3. add attribute 추가
		
		// 4. forward / redirect
	}
}
