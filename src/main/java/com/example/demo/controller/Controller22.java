package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {

	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");
		System.out.println(cnt1 + cnt2 + cnt3);
	}
	
	@RequestMapping("link2")
	public void method2() {
		int cnt1 = mapper.sql2(3416.31, "assd");
		System.out.println(cnt1);
	}
	
	@RequestMapping("link3")
	public void method3(Double v1, String v2) {
		int cnt1 = mapper.sql2(v1, v2);
		System.out.println(cnt1);
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto09 = new Dto09();
		dto09.setV1(300);
		dto09.setV2("hello mybatis");
		dto09.setV3(33.33);
		
		int cnt1 = mapper.sql3(dto09);
		System.out.println(cnt1);
	}
	
	@RequestMapping("link5")
	public void method5(int i, String str, Double d) {
		Dto10 dto = new Dto10();
		dto.setAge(i);
		dto.setName(str);
		dto.setScore(d);	
		
		int cnt = mapper.sql4(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link6")
	public void method6(Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행 입력됨");
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setV1(345);
		dto2.setName("서태웅");
		dto1.setV3(99.8);
		
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "개 행 추가됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setV1(123);
		dto1.setV2("구");
		dto1.setV3(39.99);
		dto2.setAge(10);
		dto2.setName("십");
		dto2.setScore(10.10);
		
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt + "개 행 추가됨");
	}
	
	@RequestMapping("link10")
	public void method10(Dto09 p1, Dto10 p2) {
		int cnt = mapper.sql6(p1, p2);
		System.out.println(cnt + "행 입력!");
		
	}
	
	@RequestMapping("link11")
	@ResponseBody
	public String method11(Dto11 dto) {
		System.out.println("prop1:" + dto.getProp1());
		int cnt = mapper.sql7(dto);
		System.out.println(cnt + "행 입력 완료!!");
		System.out.println("prop1:" + dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력완료";
	}
	
	@RequestMapping("link12")
	@ResponseBody
	public String method12(Dto12 dto) {
		int cnt = mapper.sql8(dto);
		
		return dto.getId() + "번째 데이터 입력완료";
	}
}
