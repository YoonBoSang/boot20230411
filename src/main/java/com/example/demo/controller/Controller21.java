package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {
	
	@Autowired
	private Mapper02 mapper;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT CustomerName FROM Customers
				""";
		
		List<String> list = mapper.sql1();
		System.out.println(list);
		
		list.forEach(System.out::println);
	}
	
	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";
		List<String> list = mapper.sql2();
		
		list.forEach(System.out::println);
	}

	@RequestMapping("link3")
	public void method3() {
		List<Dto07> list = mapper.sql3();
		list.forEach(System.out::println);
		
	}
	
	@RequestMapping("link4")
	public void method4() {
		List<Dto08> list = mapper.sql4();
//		list.forEach(System.out::println);
		for(Dto08 i : list) {
			System.out.println(i.getProductName() + " : " + i.getPrice() + "$");
		}
	}
	
	@RequestMapping("link5")
	public void method5(@RequestParam("cid") Integer cid) {
		List<String> list = mapper.sql5(cid);
		list.forEach(System.out::println);
	}
	
	@RequestMapping("link6")
	public void method6(String country) {
		List<String> list = mapper.sql6(country);
		list.forEach(System.out::println);
	}
	
	@RequestMapping("link7")
	public void method7(Integer cid) {
		List<Dto08> list = mapper.sql7(cid);
		for(Dto08 i : list) {
			System.out.println(i.getProductName() + " : " + i.getPrice());
		}
	}
	
	
	
}
