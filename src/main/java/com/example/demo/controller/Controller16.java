package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub16")
public class Controller16 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(int id) throws Exception {
		String sql = """
				DELETE FROM Suppliers
				WHERE SupplierID = ?
				""";

		try (
				Connection con = DriverManager.getConnection(url, name, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, id);
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 데이터 삭제됨");
		}
	}
	
	@RequestMapping("link2")
	public void method2(int id) throws Exception {
		String sql = """
				DELETE FROM Customers
				WHERE CustomerID = ?
				""";
		
		try	(
			Connection con = DriverManager.getConnection(url, name, password);
			PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		}
		
	}
}
