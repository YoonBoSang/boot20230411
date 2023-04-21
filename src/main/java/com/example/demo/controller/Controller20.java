package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;


@Controller
@RequestMapping("sub20")
public class Controller20 {
	
	@Autowired
	private Mapper01 mapper;

	@RequestMapping("link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println(name);
		
		System.out.println(mapper.method2());
	}
	
	@RequestMapping("link2")
	public void method2() {
		
		System.out.println(mapper.method3());
	}
	
	@RequestMapping("link3")
	public void method3() {
		System.out.println(mapper.method4(5));
	}
	
	@RequestMapping("link4")
	public void method4(@RequestParam("id") Integer customerID) {
		System.out.println(mapper.method4(customerID));
	}
	
	@RequestMapping("link5")
	public void method5(Integer id) {
		System.out.println(mapper.method5(id));
	}
	
	@RequestMapping("link6")
	public void method6() {
		System.out.println(mapper.method6());
	}
	
	@RequestMapping("link7")
	public void method7() {
		System.out.println(mapper.method7());
	}
	
	@RequestMapping("link8")
	public void method8() {
		System.out.println(mapper.method8());
	}
	
	@RequestMapping("link9")
	public void method9() {
		System.out.println(mapper.method9());
	}
	
	@RequestMapping("link10")
	public void method10() {
		System.out.println(mapper.method10());
		System.out.println(mapper.method10().getTitle());
		System.out.println(mapper.method10().getPrice());
		System.out.println(mapper.method10().getWeight());
		System.out.println(mapper.method10().getUpdated());
		System.out.println(mapper.method10().getPublished());
	}
	
	@RequestMapping("link11")
	public void method11() {
		System.out.println(mapper.method11());
		System.out.println(mapper.method11().getName());
		System.out.println(mapper.method11().getAge() + "세");
		System.out.println(mapper.method11().getPrice());
		System.out.println(mapper.method11().getBirth());
		System.out.println(mapper.method11().getInserted());
	}
	
	@RequestMapping("link12")
	public void method12() {
		System.out.println(mapper.method12());
		System.out.println(mapper.method12().getCustomername());
		System.out.println(mapper.method12().getContactName());
		System.out.println(mapper.method12().getAddress());
		System.out.println(mapper.method12().getCity());
		System.out.println(mapper.method12().getPostalCode());
		System.out.println(mapper.method12().getCountry());
	}
	
	@RequestMapping("link13")
	public void method13() {
		System.out.println(mapper.method13());
	}
	
	@RequestMapping("link14")
	public void method14() {
		System.out.println(mapper.method14());
	}
}
