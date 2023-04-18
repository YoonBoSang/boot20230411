package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub17")
public class Controller17 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(int id, String name) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET SupplierName = ?
				WHERE SupplierID = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행 수정됨");
		}

	}

	@RequestMapping("link2")
	public void method2(int id, String address) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET Address = ?
				WHERE SupplierID = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, address);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		}
	}

	@RequestMapping("link3")
	public void method3(Supplier supplier) throws Exception {
		String sql = """
				UPDATE Suppliers
				SET SupplierName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?,
					Phone = ?
				WHERE SupplierID = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, supplier.getName());
			pstmt.setString(2, supplier.getContactName());
			pstmt.setString(3, supplier.getAddress());
			pstmt.setString(4, supplier.getCity());
			pstmt.setString(5, supplier.getPostalCode());
			pstmt.setString(6, supplier.getCountry());
			pstmt.setString(7, supplier.getPhone());
			pstmt.setInt(8, supplier.getId());

			int cnt = pstmt.executeUpdate();
			System.out.println(supplier.getId() + "번 공급자 수정됨");
		}

	}

	@RequestMapping("link4")
	public void method4(int id, Model model) throws Exception {
		String sql = """
				SELECT
					SupplierID,
					SupplierName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country,
					Phone
				FROM Suppliers
				WHERE SupplierID = ?
				""";
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, id);
			try (ResultSet rs = pstmt.executeQuery();) {
				
				if (rs.next()) {
					Supplier supplier = new Supplier();
					supplier.setId(rs.getInt("supplierID"));
					supplier.setName(rs.getString("supplierName"));
					supplier.setContactName(rs.getString("contactName"));
					supplier.setAddress(rs.getString("address"));
					supplier.setCity(rs.getString("city"));
					supplier.setPostalCode(rs.getString("postalCode"));
					supplier.setCountry(rs.getString("country"));
					supplier.setPhone(rs.getString("phone"));
					model.addAttribute("supplier", supplier);
				}
			}
		}
	}
	
	@RequestMapping("link5")
	public void method(int id, Model model) throws Exception {
		String sql = """
				SELECT 
					CustomerId,
					CustomerName,
					ContactName,
					Address,
					City,
					PostalCode,
					Country
				FROM Customers
				WHERE CustomerID = ?
				""";
		try(
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setInt(1, id);
			try(ResultSet rs = pstmt.executeQuery();) {
				if(rs.next()) {
					Customer customer = new Customer();
					customer.setId(rs.getInt("customerID"));
					customer.setName(rs.getString("customerName"));
					customer.setContactName(rs.getString("contactName"));
					customer.setAddress(rs.getString("address"));
					customer.setCity(rs.getString("city"));
					customer.setPostalCode(rs.getString("postalCode"));
					customer.setCountry(rs.getString("country"));
					model.addAttribute("customer", customer);
				}
			}
		}
		
	}
	
	@RequestMapping("link6")
	public void method6(Customer customer) throws Exception {
		String sql = """
				UPDATE Customers
				SET
					CustomerName = ?,
					ContactName = ?,
					Address = ?,
					City = ?,
					PostalCode = ?,
					Country = ?
				WHERE CustomerID = ?
				""";
		
		try (
				Connection con = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = con.prepareStatement(sql);
				) {
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getContactName());
			pstmt.setString(3, customer.getAddress());
			pstmt.setString(4, customer.getCity());
			pstmt.setString(5, customer.getPostalCode());
			pstmt.setString(6, customer.getCountry());
			pstmt.setInt(7, customer.getId());
			int cnt = pstmt.executeUpdate();
			System.out.println(customer.getId() + "번 고객정보 수정됨");
		}
	}
}
