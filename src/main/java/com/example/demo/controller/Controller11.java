package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub11")
public class Controller11 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) {
		// 2. business logic
		// SELECT CustomerName FROM Customers WHERE CustomerID = 1;

		String sql = "SELECT CustomerName FROM Customers WHERE CustomerID = 1";

		// db 연결
		try (
				Connection connection = DriverManager.getConnection(url, name, password);
				// Statement 객체 생성
				Statement statement = connection.createStatement();
				// 쿼리실행
				// 쿼리실행 결과 얻고
				ResultSet resultSet = statement.executeQuery(sql);) {
			// 쿼리실행 결과 가공
			String name = "";
			if (resultSet.next()) {
				name = resultSet.getString("CustomerName");
			}

			// 3. add attribute
			model.addAttribute("customerName", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. forward

	}

	@RequestMapping("link2")
	public void method2() {
		String employeeName = "";
		// 2. business logic
		// id 3인 직원의 last name 조회
		String sql = "SELECT lastName FROM Employees WHERE EmployeeId = 3";

		try (
				// 1. 연결하기
				Connection con = DriverManager.getConnection(url, name, password);
				// 2. statement 생성
				Statement stmt = con.createStatement();
				// 3. 쿼리 실행 후 resultSet 얻기
				ResultSet rs = stmt.executeQuery(sql);
		// 4. resultSet에 결과 있는 지 확인하고
		) {
			if (rs.next()) {
				// 5. 결과 꺼내서 담기
				employeeName = rs.getString("lastName");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(employeeName);

	}

	@RequestMapping("link3")
	public void method3(Model model) {
		String ProductName = "";

		String sql = "SELECT ProductName FROM Products WHERE ProductId = 5";

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				if (rs.next()) {
					ProductName = rs.getString("ProductName");
				}
			}
			model.addAttribute("ProductName", ProductName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link4")
	public void method4(Model model) {
		// #업무
		// 고객 이름들 조회

		String sql = """
				SELECT CustomerName
				FROM Customers
				""";

		List<String> list = new ArrayList<>();

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				// list에 고객 이름들을 담고
				while (rs.next()) {
					list.add(rs.getString("CustomerName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 3. add attribute
		model.addAttribute("customerNames", list);

		// 4. forward
	}
	
	@RequestMapping("link5")
	public void method5(Model model) {
		String sql = """
				SELECT FirstName 
				FROM Employees;
				""";
		
		List<String> list = new ArrayList<>();
		try	{
			
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
			try	(con; stmt; rs;) {
				while (rs.next()) {
					list.add(rs.getString("FirstName"));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("FirstNames", list);
	}
}
