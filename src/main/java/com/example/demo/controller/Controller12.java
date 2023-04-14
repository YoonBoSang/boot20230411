package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1(Model model) {
		String sql = """
				SELECT LastName
				FROM Employees
				""";

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {

				System.out.println(rs.next());
				String name1 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next());
				String name2 = rs.getString("lastName");
				System.out.println(name2);

				System.out.println(rs.next());
				String name3 = rs.getString("lastName");
				System.out.println(name3);

				System.out.println(rs.next());
				String name4 = rs.getString("lastName");
				System.out.println(name4);

				System.out.println(rs.next());
				String name5 = rs.getString("lastName");
				System.out.println(name5);

				System.out.println(rs.next());
				String name6 = rs.getString("lastName");
				System.out.println(name6);

				System.out.println(rs.next());
				String name7 = rs.getString("lastName");
				System.out.println(name7);

				System.out.println(rs.next());
				String name8 = rs.getString("lastName");
				System.out.println(name8);

				System.out.println(rs.next());
				String name9 = rs.getString("lastName");
				System.out.println(name9);

				System.out.println(rs.next());
				String name10 = rs.getString("lastName");
				System.out.println(name10);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName
				FROM Employees
				""";

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@RequestMapping("link3")
	public void method3(Model model) {
		List<String> list = new ArrayList<>();
		String sql = """
				SELECT ShipperName FROM Shippers
				""";

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					list.add(rs.getString("ShipperName"));
				}
			}
			model.addAttribute("nameList", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link4")
	public void method4(Model model) {
		String sql = "SELECT * FROM Customers";
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				rs.next();
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));

				rs.next();
				System.out.println(rs.getString("customerName"));
				System.out.println(rs.getString("contactName"));
				System.out.println(rs.getString("country"));
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link5")
	public void method5(Model model) {
		String sql = "SELECT * FROM Customers";
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					System.out.println("---------------------");
					System.out.println(rs.getString("customerName"));
					System.out.println(rs.getString("contactName"));
					System.out.println(rs.getString("country"));
				}

			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link6")
	public void method6() {
		String sql = "SELECT * FROM Products WHERE ProductID <= 3";

		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {

				while (rs.next()) {
					System.out.println(rs.getInt("ProductID"));
					System.out.println(rs.getString("ProductName"));
					System.out.println(rs.getDouble("Price"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link7")
	public void method7(Model model) {
		String sql = "SELECT * FROM Customers WHERE CustomerID < 4";
		Map<Integer, String> map = new HashMap<>();

		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {
				while (rs.next()) {
					map.put(rs.getInt("CustomerID"), rs.getString("CustomerName"));
				}
			}
			model.addAttribute("CustomerMap", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("link8")
	public void method8() {
		String sql = """
				SELECT LastName, FirstName
				FROM Employees
				WHERE EmployeeID < 4
				""";
		try {

			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (con; stmt; rs;) {
				while (rs.next()) {
					String lastName = rs.getString(1);
					String firstName = rs.getString(2);
					System.out.println(lastName + ", " + firstName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("link9")
	public void method9(Model model) {
		String sql = """
				SELECT CustomerID, CustomerName, Country FROM Customers
				""";
		List<Dto05> list = new ArrayList<>(); 
		try {
			Connection con = DriverManager.getConnection(url, name, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			try (con; stmt; rs;) {

				while (rs.next()) {
					Dto05 dto05 = new Dto05();
					dto05.setId(rs.getInt(1));
					dto05.setName(rs.getString(2));
					dto05.setCountry(rs.getString(3));
					list.add(dto05);
				}
			}
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
